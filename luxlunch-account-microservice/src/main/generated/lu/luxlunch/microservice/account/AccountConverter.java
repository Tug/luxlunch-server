package lu.luxlunch.microservice.account;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link lu.luxlunch.microservice.account.Account}.
 * NOTE: This class has been automatically generated from the {@link lu.luxlunch.microservice.account.Account} original class using Vert.x codegen.
 */
public class AccountConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Account obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "id":
          if (member.getValue() instanceof String) {
            obj.setId((String)member.getValue());
          }
          break;
        case "username":
          if (member.getValue() instanceof String) {
            obj.setUsername((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(Account obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(Account obj, java.util.Map<String, Object> json) {
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getUsername() != null) {
      json.put("username", obj.getUsername());
    }
  }
}
