/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
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

package io.swagger.client.model

import org.joda.time.DateTime
import com.fasterxml.jackson.annotation.{JsonCreator, JsonValue}

case class Order (
  id: Option[Long] = None,
  petId: Option[Long] = None,
  quantity: Option[Integer] = None,
  shipDate: Option[DateTime] = None,
  /* Order Status */
  status: Option[OrderStatusEnum] = None,
  complete: Option[Boolean] = None
)

case class OrderStatusEnum(@JsonValue value: String)
object OrderStatusEnum {
  // TODO. Turn this string into an enumeration. Here are the values:
  
  // val _placed = Value("placed")
  // val _approved = Value("approved")
  // val _delivered = Value("delivered")

  @JsonCreator
  def create(value: String) = {
    OrderStatusEnum(value)
  }
}

