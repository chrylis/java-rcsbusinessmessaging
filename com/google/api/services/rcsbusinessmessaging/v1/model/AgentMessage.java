/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2021-08-24 11:56:07 EDT)
 * on 2021-08-24 at 15:56:28 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.rcsbusinessmessaging.v1.model;

/**
 * A message sent from the agent to a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the RCS Business Messaging API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AgentMessage extends com.google.api.client.json.GenericJson {

  /**
   * The content of the agent message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AgentContentMessage contentMessage;

  /**
   * This field is set by the RBM platform. Do not include it when creating an agent message. The
   * field resolves "phones/{E.164}/agentMessages/{messageId}", where {E.164} is the user's phone
   * number in E.164 format and {messageId} is the agent-assigned ID of the agent message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * This field is set by the RBM platform. Do not include it when creating an agent message. The
   * field resolves the time when the message is sent to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String sendTime;

  /**
   * The content of the agent message.
   * @return value or {@code null} for none
   */
  public AgentContentMessage getContentMessage() {
    return contentMessage;
  }

  /**
   * The content of the agent message.
   * @param contentMessage contentMessage or {@code null} for none
   */
  public AgentMessage setContentMessage(AgentContentMessage contentMessage) {
    this.contentMessage = contentMessage;
    return this;
  }

  /**
   * This field is set by the RBM platform. Do not include it when creating an agent message. The
   * field resolves "phones/{E.164}/agentMessages/{messageId}", where {E.164} is the user's phone
   * number in E.164 format and {messageId} is the agent-assigned ID of the agent message.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * This field is set by the RBM platform. Do not include it when creating an agent message. The
   * field resolves "phones/{E.164}/agentMessages/{messageId}", where {E.164} is the user's phone
   * number in E.164 format and {messageId} is the agent-assigned ID of the agent message.
   * @param name name or {@code null} for none
   */
  public AgentMessage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * This field is set by the RBM platform. Do not include it when creating an agent message. The
   * field resolves the time when the message is sent to the user.
   * @return value or {@code null} for none
   */
  public String getSendTime() {
    return sendTime;
  }

  /**
   * This field is set by the RBM platform. Do not include it when creating an agent message. The
   * field resolves the time when the message is sent to the user.
   * @param sendTime sendTime or {@code null} for none
   */
  public AgentMessage setSendTime(String sendTime) {
    this.sendTime = sendTime;
    return this;
  }

  @Override
  public AgentMessage set(String fieldName, Object value) {
    return (AgentMessage) super.set(fieldName, value);
  }

  @Override
  public AgentMessage clone() {
    return (AgentMessage) super.clone();
  }

}
