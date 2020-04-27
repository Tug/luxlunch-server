package lu.luxlunch.microservice.account;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * User account data object
 *
 * @author Eric Zhao
 */
@DataObject(generateConverter = true)
public class Account {

  private String id;
  private String username;

  public Account() {
    // Empty constructor
  }

  public Account(JsonObject json) {
    AccountConverter.fromJson(json, this);
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AccountConverter.toJson(this, json);
    return json;
  }

  public String getId() {
    return id;
  }

  public Account setId(String id) {
    this.id = id;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public Account setUsername(String username) {
    this.username = username;
    return this;
  }

  @Override
  public String toString() {
    return toJson().encodePrettily();
  }

}
