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
 * A sequence of media data references representing composite data. Introduced to support Bigstore
 * composite objects. For details, visit http://go/bigstore-composites.
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
public final class GdataCompositeMedia extends com.google.api.client.json.GenericJson {

  /**
   * Blobstore v1 reference, set if reference_type is BLOBSTORE_REF This should be the byte
   * representation of a blobstore.BlobRef. Since Blobstore is deprecating v1, use blobstore2_info
   * instead. For now, any v2 blob will also be represented in this field as v1 BlobRef.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String blobRef;

  /**
   * Blobstore v2 info, set if reference_type is BLOBSTORE_REF and it refers to a v2 blob.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataBlobstore2Info blobstore2Info;

  /**
   * A binary data reference for a media download. Serves as a technology-agnostic binary reference
   * in some Google infrastructure. This value is a serialized storage_cosmo.BinaryReference proto.
   * Storing it as bytes is a hack to get around the fact that the cosmo proto (as well as others it
   * includes) doesn't support JavaScript. This prevents us from including the actual type of this
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cosmoBinaryReference;

  /**
   * crc32.c hash for the payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long crc32cHash;

  /**
   * Media data, set if reference_type is INLINE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inline;

  /**
   * Size of the data, in bytes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long length;

  /**
   * MD5 hash for the payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5Hash;

  /**
   * Reference to a TI Blob, set if reference_type is BIGSTORE_REF.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataObjectId objectId;

  /**
   * Path to the data, set if reference_type is PATH
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Describes what the field reference contains.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceType;

  /**
   * SHA-1 hash for the payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sha1Hash;

  /**
   * Blobstore v1 reference, set if reference_type is BLOBSTORE_REF This should be the byte
   * representation of a blobstore.BlobRef. Since Blobstore is deprecating v1, use blobstore2_info
   * instead. For now, any v2 blob will also be represented in this field as v1 BlobRef.
   * @see #decodeBlobRef()
   * @return value or {@code null} for none
   */
  public java.lang.String getBlobRef() {
    return blobRef;
  }

  /**
   * Blobstore v1 reference, set if reference_type is BLOBSTORE_REF This should be the byte
   * representation of a blobstore.BlobRef. Since Blobstore is deprecating v1, use blobstore2_info
   * instead. For now, any v2 blob will also be represented in this field as v1 BlobRef.
   * @see #getBlobRef()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBlobRef() {
    return com.google.api.client.util.Base64.decodeBase64(blobRef);
  }

  /**
   * Blobstore v1 reference, set if reference_type is BLOBSTORE_REF This should be the byte
   * representation of a blobstore.BlobRef. Since Blobstore is deprecating v1, use blobstore2_info
   * instead. For now, any v2 blob will also be represented in this field as v1 BlobRef.
   * @see #encodeBlobRef()
   * @param blobRef blobRef or {@code null} for none
   */
  public GdataCompositeMedia setBlobRef(java.lang.String blobRef) {
    this.blobRef = blobRef;
    return this;
  }

  /**
   * Blobstore v1 reference, set if reference_type is BLOBSTORE_REF This should be the byte
   * representation of a blobstore.BlobRef. Since Blobstore is deprecating v1, use blobstore2_info
   * instead. For now, any v2 blob will also be represented in this field as v1 BlobRef.
   * @see #setBlobRef()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataCompositeMedia encodeBlobRef(byte[] blobRef) {
    this.blobRef = com.google.api.client.util.Base64.encodeBase64URLSafeString(blobRef);
    return this;
  }

  /**
   * Blobstore v2 info, set if reference_type is BLOBSTORE_REF and it refers to a v2 blob.
   * @return value or {@code null} for none
   */
  public GdataBlobstore2Info getBlobstore2Info() {
    return blobstore2Info;
  }

  /**
   * Blobstore v2 info, set if reference_type is BLOBSTORE_REF and it refers to a v2 blob.
   * @param blobstore2Info blobstore2Info or {@code null} for none
   */
  public GdataCompositeMedia setBlobstore2Info(GdataBlobstore2Info blobstore2Info) {
    this.blobstore2Info = blobstore2Info;
    return this;
  }

  /**
   * A binary data reference for a media download. Serves as a technology-agnostic binary reference
   * in some Google infrastructure. This value is a serialized storage_cosmo.BinaryReference proto.
   * Storing it as bytes is a hack to get around the fact that the cosmo proto (as well as others it
   * includes) doesn't support JavaScript. This prevents us from including the actual type of this
   * field.
   * @see #decodeCosmoBinaryReference()
   * @return value or {@code null} for none
   */
  public java.lang.String getCosmoBinaryReference() {
    return cosmoBinaryReference;
  }

  /**
   * A binary data reference for a media download. Serves as a technology-agnostic binary reference
   * in some Google infrastructure. This value is a serialized storage_cosmo.BinaryReference proto.
   * Storing it as bytes is a hack to get around the fact that the cosmo proto (as well as others it
   * includes) doesn't support JavaScript. This prevents us from including the actual type of this
   * field.
   * @see #getCosmoBinaryReference()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCosmoBinaryReference() {
    return com.google.api.client.util.Base64.decodeBase64(cosmoBinaryReference);
  }

  /**
   * A binary data reference for a media download. Serves as a technology-agnostic binary reference
   * in some Google infrastructure. This value is a serialized storage_cosmo.BinaryReference proto.
   * Storing it as bytes is a hack to get around the fact that the cosmo proto (as well as others it
   * includes) doesn't support JavaScript. This prevents us from including the actual type of this
   * field.
   * @see #encodeCosmoBinaryReference()
   * @param cosmoBinaryReference cosmoBinaryReference or {@code null} for none
   */
  public GdataCompositeMedia setCosmoBinaryReference(java.lang.String cosmoBinaryReference) {
    this.cosmoBinaryReference = cosmoBinaryReference;
    return this;
  }

  /**
   * A binary data reference for a media download. Serves as a technology-agnostic binary reference
   * in some Google infrastructure. This value is a serialized storage_cosmo.BinaryReference proto.
   * Storing it as bytes is a hack to get around the fact that the cosmo proto (as well as others it
   * includes) doesn't support JavaScript. This prevents us from including the actual type of this
   * field.
   * @see #setCosmoBinaryReference()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataCompositeMedia encodeCosmoBinaryReference(byte[] cosmoBinaryReference) {
    this.cosmoBinaryReference = com.google.api.client.util.Base64.encodeBase64URLSafeString(cosmoBinaryReference);
    return this;
  }

  /**
   * crc32.c hash for the payload.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCrc32cHash() {
    return crc32cHash;
  }

  /**
   * crc32.c hash for the payload.
   * @param crc32cHash crc32cHash or {@code null} for none
   */
  public GdataCompositeMedia setCrc32cHash(java.lang.Long crc32cHash) {
    this.crc32cHash = crc32cHash;
    return this;
  }

  /**
   * Media data, set if reference_type is INLINE
   * @see #decodeInline()
   * @return value or {@code null} for none
   */
  public java.lang.String getInline() {
    return inline;
  }

  /**
   * Media data, set if reference_type is INLINE
   * @see #getInline()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeInline() {
    return com.google.api.client.util.Base64.decodeBase64(inline);
  }

  /**
   * Media data, set if reference_type is INLINE
   * @see #encodeInline()
   * @param inline inline or {@code null} for none
   */
  public GdataCompositeMedia setInline(java.lang.String inline) {
    this.inline = inline;
    return this;
  }

  /**
   * Media data, set if reference_type is INLINE
   * @see #setInline()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataCompositeMedia encodeInline(byte[] inline) {
    this.inline = com.google.api.client.util.Base64.encodeBase64URLSafeString(inline);
    return this;
  }

  /**
   * Size of the data, in bytes
   * @return value or {@code null} for none
   */
  public java.lang.Long getLength() {
    return length;
  }

  /**
   * Size of the data, in bytes
   * @param length length or {@code null} for none
   */
  public GdataCompositeMedia setLength(java.lang.Long length) {
    this.length = length;
    return this;
  }

  /**
   * MD5 hash for the payload.
   * @see #decodeMd5Hash()
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5Hash() {
    return md5Hash;
  }

  /**
   * MD5 hash for the payload.
   * @see #getMd5Hash()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeMd5Hash() {
    return com.google.api.client.util.Base64.decodeBase64(md5Hash);
  }

  /**
   * MD5 hash for the payload.
   * @see #encodeMd5Hash()
   * @param md5Hash md5Hash or {@code null} for none
   */
  public GdataCompositeMedia setMd5Hash(java.lang.String md5Hash) {
    this.md5Hash = md5Hash;
    return this;
  }

  /**
   * MD5 hash for the payload.
   * @see #setMd5Hash()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataCompositeMedia encodeMd5Hash(byte[] md5Hash) {
    this.md5Hash = com.google.api.client.util.Base64.encodeBase64URLSafeString(md5Hash);
    return this;
  }

  /**
   * Reference to a TI Blob, set if reference_type is BIGSTORE_REF.
   * @return value or {@code null} for none
   */
  public GdataObjectId getObjectId() {
    return objectId;
  }

  /**
   * Reference to a TI Blob, set if reference_type is BIGSTORE_REF.
   * @param objectId objectId or {@code null} for none
   */
  public GdataCompositeMedia setObjectId(GdataObjectId objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * Path to the data, set if reference_type is PATH
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Path to the data, set if reference_type is PATH
   * @param path path or {@code null} for none
   */
  public GdataCompositeMedia setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Describes what the field reference contains.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceType() {
    return referenceType;
  }

  /**
   * Describes what the field reference contains.
   * @param referenceType referenceType or {@code null} for none
   */
  public GdataCompositeMedia setReferenceType(java.lang.String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

  /**
   * SHA-1 hash for the payload.
   * @see #decodeSha1Hash()
   * @return value or {@code null} for none
   */
  public java.lang.String getSha1Hash() {
    return sha1Hash;
  }

  /**
   * SHA-1 hash for the payload.
   * @see #getSha1Hash()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSha1Hash() {
    return com.google.api.client.util.Base64.decodeBase64(sha1Hash);
  }

  /**
   * SHA-1 hash for the payload.
   * @see #encodeSha1Hash()
   * @param sha1Hash sha1Hash or {@code null} for none
   */
  public GdataCompositeMedia setSha1Hash(java.lang.String sha1Hash) {
    this.sha1Hash = sha1Hash;
    return this;
  }

  /**
   * SHA-1 hash for the payload.
   * @see #setSha1Hash()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataCompositeMedia encodeSha1Hash(byte[] sha1Hash) {
    this.sha1Hash = com.google.api.client.util.Base64.encodeBase64URLSafeString(sha1Hash);
    return this;
  }

  @Override
  public GdataCompositeMedia set(String fieldName, Object value) {
    return (GdataCompositeMedia) super.set(fieldName, value);
  }

  @Override
  public GdataCompositeMedia clone() {
    return (GdataCompositeMedia) super.clone();
  }

}
