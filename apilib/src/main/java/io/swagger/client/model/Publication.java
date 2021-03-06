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
 * Publications provide a way for authors to work collaboratively within a common narrative framework, brand or point of view.
 */
@ApiModel(description = "Publications provide a way for authors to work collaboratively within a common narrative framework, brand or point of view.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-22T21:34:48.259-04:00")
public class Publication   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("imageUrl")
  private String imageUrl = null;

  public Publication id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the publication.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "A unique identifier for the publication.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Publication name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The publication’s name on Medium.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The publication’s name on Medium.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Publication description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description of the publication
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Short description of the publication")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Publication url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL to the publication’s homepage
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The URL to the publication’s homepage")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Publication imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The URL to the publication’s image/logo
   * @return imageUrl
  **/
  @ApiModelProperty(example = "null", value = "The URL to the publication’s image/logo")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Publication publication = (Publication) o;
    return Objects.equals(this.id, publication.id) &&
        Objects.equals(this.name, publication.name) &&
        Objects.equals(this.description, publication.description) &&
        Objects.equals(this.url, publication.url) &&
        Objects.equals(this.imageUrl, publication.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, url, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Publication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

