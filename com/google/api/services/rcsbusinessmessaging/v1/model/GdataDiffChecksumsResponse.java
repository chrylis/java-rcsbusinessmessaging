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
 * (build: 2021-04-19 13:59:11 EDT)
 * on 2021-04-19 at 17:59:33 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.rcsbusinessmessaging.v1.model;

/**
 * Backend response for a Diff get checksums response. For details on the Scotty Diff protocol,
 * visit http://go/scotty-diff-protocol.
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
public final class GdataDiffChecksumsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Exactly one of these fields must be populated. If checksums_location is filled, the server will
   * return the corresponding contents to the user. If object_location is filled, the server will
   * calculate the checksums based on the content there and return that to the user. For details on
   * the format of the checksums, see http://go/scotty-diff-protocol.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataCompositeMedia checksumsLocation;

  /**
   * The chunk size of checksums. Must be a multiple of 256KB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long chunkSizeBytes;

  /**
   * If set, calculate the checksums based on the contents and return them to the caller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataCompositeMedia objectLocation;

  /**
   * The total size of the server object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long objectSizeBytes;

  /**
   * The object version of the object the checksums are being returned for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectVersion;

  /**
   * Exactly one of these fields must be populated. If checksums_location is filled, the server will
   * return the corresponding contents to the user. If object_location is filled, the server will
   * calculate the checksums based on the content there and return that to the user. For details on
   * the format of the checksums, see http://go/scotty-diff-protocol.
   * @return value or {@code null} for none
   */
  public GdataCompositeMedia getChecksumsLocation() {
    return checksumsLocation;
  }

  /**
   * Exactly one of these fields must be populated. If checksums_location is filled, the server will
   * return the corresponding contents to the user. If object_location is filled, the server will
   * calculate the checksums based on the content there and return that to the user. For details on
   * the format of the checksums, see http://go/scotty-diff-protocol.
   * @param checksumsLocation checksumsLocation or {@code null} for none
   */
  public GdataDiffChecksumsResponse setChecksumsLocation(GdataCompositeMedia checksumsLocation) {
    this.checksumsLocation = checksumsLocation;
    return this;
  }

  /**
   * The chunk size of checksums. Must be a multiple of 256KB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getChunkSizeBytes() {
    return chunkSizeBytes;
  }

  /**
   * The chunk size of checksums. Must be a multiple of 256KB.
   * @param chunkSizeBytes chunkSizeBytes or {@code null} for none
   */
  public GdataDiffChecksumsResponse setChunkSizeBytes(java.lang.Long chunkSizeBytes) {
    this.chunkSizeBytes = chunkSizeBytes;
    return this;
  }

  /**
   * If set, calculate the checksums based on the contents and return them to the caller.
   * @return value or {@code null} for none
   */
  public GdataCompositeMedia getObjectLocation() {
    return objectLocation;
  }

  /**
   * If set, calculate the checksums based on the contents and return them to the caller.
   * @param objectLocation objectLocation or {@code null} for none
   */
  public GdataDiffChecksumsResponse setObjectLocation(GdataCompositeMedia objectLocation) {
    this.objectLocation = objectLocation;
    return this;
  }

  /**
   * The total size of the server object.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObjectSizeBytes() {
    return objectSizeBytes;
  }

  /**
   * The total size of the server object.
   * @param objectSizeBytes objectSizeBytes or {@code null} for none
   */
  public GdataDiffChecksumsResponse setObjectSizeBytes(java.lang.Long objectSizeBytes) {
    this.objectSizeBytes = objectSizeBytes;
    return this;
  }

  /**
   * The object version of the object the checksums are being returned for.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectVersion() {
    return objectVersion;
  }

  /**
   * The object version of the object the checksums are being returned for.
   * @param objectVersion objectVersion or {@code null} for none
   */
  public GdataDiffChecksumsResponse setObjectVersion(java.lang.String objectVersion) {
    this.objectVersion = objectVersion;
    return this;
  }

  @Override
  public GdataDiffChecksumsResponse set(String fieldName, Object value) {
    return (GdataDiffChecksumsResponse) super.set(fieldName, value);
  }

  @Override
  public GdataDiffChecksumsResponse clone() {
    return (GdataDiffChecksumsResponse) super.clone();
  }

}
