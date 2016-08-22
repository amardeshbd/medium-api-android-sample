/**
 * Medium.com - Unofficial API Spec
 * Medium’s unofficial API documentation using OpenAPI specification.  # Official API Official API document can also be viewed for most up to date API spec at [https://github.com/Medium/medium-api-docs](https://github.com/Medium/medium-api-docs).  Developer resource - [https://medium.com/developers](https://medium.com/developers) 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contibutor
 */
@ApiModel(description = "Contibutor")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-21T22:52:12.608-04:00")
public class Contibutor   {
  @SerializedName("publicationId")
  private String publicationId = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("role")
  private String role = null;

  public Contibutor publicationId(String publicationId) {
    this.publicationId = publicationId;
    return this;
  }

   /**
   * An ID for the publication. This can be lifted from response of publications above
   * @return publicationId
  **/
  @ApiModelProperty(example = "null", value = "An ID for the publication. This can be lifted from response of publications above")
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  public Contibutor userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * A user ID of the contributor.
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "A user ID of the contributor.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Contibutor role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Role of the user identified by userId in the publication identified by `publicationId`. *editor* or *writer*
   * @return role
  **/
  @ApiModelProperty(example = "null", value = "Role of the user identified by userId in the publication identified by `publicationId`. *editor* or *writer*")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contibutor contibutor = (Contibutor) o;
    return Objects.equals(this.publicationId, contibutor.publicationId) &&
        Objects.equals(this.userId, contibutor.userId) &&
        Objects.equals(this.role, contibutor.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationId, userId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contibutor {\n");
    
    sb.append("    publicationId: ").append(toIndentedString(publicationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

