#! /bin/bash
PROGNAME=$0

usage() {
  cat << EOF >&2
Usage: $PROGNAME [-f] [<file>]

 -f: force rebuild the docker image(s)
 -n: no cache, renew anonymous volumes
EOF
  exit 1
}

force=false
no_cache=false
while getopts ":fn" opt; do
  case ${opt} in
    (f) force=true;;
    (n) no_cache=true;;
    (*) usage
  esac
done
shift $((OPTIND -1))

FORCE_ARGS=""
NO_CACHE_ARGS=""
if [ "$force" = true ] ; then
  FORCE_ARGS="--build --force-recreate --no-deps"
fi
if [ "$no_cache" = true ] ; then
  NO_CACHE_ARGS="--renew-anon-volumes"
fi

docker-compose -f docker-compose-dev.yml up -d $FORCE_ARGS $NO_CACHE_ARGS $@
