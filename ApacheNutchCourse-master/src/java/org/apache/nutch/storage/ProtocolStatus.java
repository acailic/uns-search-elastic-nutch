/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.nutch.storage;

import org.apache.nutch.protocol.ProtocolStatusUtils;

@SuppressWarnings("all")
/** A nested container representing data captured from web server responses. */
public class ProtocolStatus extends
    org.apache.gora.persistency.impl.PersistentBase implements
    org.apache.avro.specific.SpecificRecord,
    org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser()
      .parse("{\"type\":\"record\",\"name\":\"ProtocolStatus\",\"namespace\":\"org.apache.nutch.storage\",\"doc\":\"A nested container representing data captured from web server responses.\",\"fields\":[{\"name\":\"code\",\"type\":\"int\",\"doc\":\"A protocol response code which can be one of SUCCESS - content was retrieved without errors, FAILED - Content was not retrieved. Any further errors may be indicated in args, PROTO_NOT_FOUND - This protocol was not found. Application may attempt to retry later, GONE - Resource is gone, MOVED - Resource has moved permanently. New url should be found in args, TEMP_MOVED - Resource has moved temporarily. New url should be found in args., NOTFOUND - Resource was not found, RETRY - Temporary failure. Application may retry immediately., EXCEPTION - Unspecified exception occured. Further information may be provided in args., ACCESS_DENIED - Access denied - authorization required, but missing/incorrect., ROBOTS_DENIED - Access denied by robots.txt rules., REDIR_EXCEEDED - Too many redirects., NOTFETCHING - Not fetching., NOTMODIFIED - Unchanged since the last fetch., WOULDBLOCK - Request was refused by protocol plugins, because it would block. The expected number of milliseconds to wait before retry may be provided in args., BLOCKED - Thread was blocked http.max.delays times during fetching.\",\"default\":0},{\"name\":\"args\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Optional arguments supplied to compliment and/or justify the response code.\",\"default\":[]},{\"name\":\"lastModified\",\"type\":\"long\",\"doc\":\"A server reponse indicating when this page was last modified, this can be unreliable at times hence this is used as a default fall back value for the preferred 'modifiedTime' and 'preModifiedTime' obtained from the WebPage itself.\",\"default\":0}]}");

  /** Enum containing all data bean's fields. */
  public static enum Field {
    CODE(0, "code"), ARGS(1, "args"), LAST_MODIFIED(2, "lastModified"), ;
    /**
     * Field's index.
     */
    private int index;

    /**
     * Field's name.
     */
    private String name;

    /**
     * Field's constructor
     * 
     * @param index
     *          field's index.
     * @param name
     *          field's name.
     */
    Field(int index, String name) {
      this.index = index;
      this.name = name;
    }

    /**
     * Gets field's index.
     * 
     * @return int field's index.
     */
    public int getIndex() {
      return index;
    }

    /**
     * Gets field's name.
     * 
     * @return String field's name.
     */
    public String getName() {
      return name;
    }

    /**
     * Gets field's attributes to string.
     * 
     * @return String field's attributes to string.
     */
    public String toString() {
      return name;
    }
  };

  public static final String[] _ALL_FIELDS = { "code", "args", "lastModified", };

  /**
   * Gets the total field count.
   * 
   * @return int field count
   */
  public int getFieldsCount() {
    return ProtocolStatus._ALL_FIELDS.length;
  }

  /**
   * A protocol response code which can be one of SUCCESS - content was
   * retrieved without errors, FAILED - Content was not retrieved. Any further
   * errors may be indicated in args, PROTO_NOT_FOUND - This protocol was not
   * found. Application may attempt to retry later, GONE - Resource is gone,
   * MOVED - Resource has moved permanently. New url should be found in args,
   * TEMP_MOVED - Resource has moved temporarily. New url should be found in
   * args., NOTFOUND - Resource was not found, RETRY - Temporary failure.
   * Application may retry immediately., EXCEPTION - Unspecified exception
   * occured. Further information may be provided in args., ACCESS_DENIED -
   * Access denied - authorization required, but missing/incorrect.,
   * ROBOTS_DENIED - Access denied by robots.txt rules., REDIR_EXCEEDED - Too
   * many redirects., NOTFETCHING - Not fetching., NOTMODIFIED - Unchanged since
   * the last fetch., WOULDBLOCK - Request was refused by protocol plugins,
   * because it would block. The expected number of milliseconds to wait before
   * retry may be provided in args., BLOCKED - Thread was blocked http.max.delays
   * times during fetching.
   */
  private int code;
  /**
   * Optional arguments supplied to compliment and/or justify the response code.
   */
  private java.util.List<java.lang.CharSequence> args;
  /**
   * A server reponse indicating when this page was last modified, this can be
   * unreliable at times hence this is used as a default fall back value for the
   * preferred 'modifiedTime' and 'preModifiedTime' obtained from the WebPage
   * itself.
   */
  private long lastModified;

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter. Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0:
      return code;
    case 1:
      return args;
    case 2:
      return lastModified;
    default:
      throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader. Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0:
      code = (java.lang.Integer) (value);
      break;
    case 1:
      args = (java.util.List<java.lang.CharSequence>) ((value instanceof org.apache.gora.persistency.Dirtyable) ? value
          : new org.apache.gora.persistency.impl.DirtyListWrapper(
              (java.util.List) value));
      break;
    case 2:
      lastModified = (java.lang.Long) (value);
      break;
    default:
      throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'code' field. A protocol response code which can be
   * one of SUCCESS - content was retrieved without errors, FAILED - Content was
   * not retrieved. Any further errors may be indicated in args, PROTO_NOT_FOUND
   * - This protocol was not found. Application may attempt to retry later, GONE
   * - Resource is gone, MOVED - Resource has moved permanently. New url should
   * be found in args, TEMP_MOVED - Resource has moved temporarily. New url
   * should be found in args., NOTFOUND - Resource was not found, RETRY -
   * Temporary failure. Application may retry immediately., EXCEPTION -
   * Unspecified exception occured. Further information may be provided in
   * args., ACCESS_DENIED - Access denied - authorization required, but
   * missing/incorrect., ROBOTS_DENIED - Access denied by robots.txt rules.,
   * REDIR_EXCEEDED - Too many redirects., NOTFETCHING - Not fetching.,
   * NOTMODIFIED - Unchanged since the last fetch., WOULDBLOCK - Request was
   * refused by protocol plugins, because it would block. The expected number of
   * milliseconds to wait before retry may be provided in args., BLOCKED -
   * Thread was blocked http.max.delays times during fetching.
   */
  public java.lang.Integer getCode() {
    return code;
  }

  /**
   * Sets the value of the 'code' field. A protocol response code which can be
   * one of SUCCESS - content was retrieved without errors, FAILED - Content was
   * not retrieved. Any further errors may be indicated in args, PROTO_NOT_FOUND
   * - This protocol was not found. Application may attempt to retry later, GONE
   * - Resource is gone, MOVED - Resource has moved permanently. New url should
   * be found in args, TEMP_MOVED - Resource has moved temporarily. New url
   * should be found in args., NOTFOUND - Resource was not found, RETRY -
   * Temporary failure. Application may retry immediately., EXCEPTION -
   * Unspecified exception occured. Further information may be provided in
   * args., ACCESS_DENIED - Access denied - authorization required, but
   * missing/incorrect., ROBOTS_DENIED - Access denied by robots.txt rules.,
   * REDIR_EXCEEDED - Too many redirects., NOTFETCHING - Not fetching.,
   * NOTMODIFIED - Unchanged since the last fetch., WOULDBLOCK - Request was
   * refused by protocol plugins, because it would block. The expected number of
   * milliseconds to wait before retry may be provided in args., BLOCKED -
   * Thread was blocked http.max.delays times during fetching. * @param value
   * the value to set.
   */
  public void setCode(java.lang.Integer value) {
    this.code = value;
    setDirty(0);
  }

  /**
   * Checks the dirty status of the 'code' field. A field is dirty if it
   * represents a change that has not yet been written to the database. A
   * protocol response code which can be one of SUCCESS - content was retrieved
   * without errors, FAILED - Content was not retrieved. Any further errors may
   * be indicated in args, PROTO_NOT_FOUND - This protocol was not found.
   * Application may attempt to retry later, GONE - Resource is gone, MOVED -
   * Resource has moved permanently. New url should be found in args, TEMP_MOVED
   * - Resource has moved temporarily. New url should be found in args.,
   * NOTFOUND - Resource was not found, RETRY - Temporary failure. Application
   * may retry immediately., EXCEPTION - Unspecified exception occured. Further
   * information may be provided in args., ACCESS_DENIED - Access denied -
   * authorization required, but missing/incorrect., ROBOTS_DENIED - Access
   * denied by robots.txt rules., REDIR_EXCEEDED - Too many redirects.,
   * NOTFETCHING - Not fetching., NOTMODIFIED - Unchanged since the last fetch.,
   * WOULDBLOCK - Request was refused by protocol plugins, because it would
   * block. The expected number of milliseconds to wait before retry may be
   * provided in args., BLOCKED - Thread was blocked http.max.delays times
   * during fetching. * @param value the value to set.
   */
  public boolean isCodeDirty(java.lang.Integer value) {
    return isDirty(0);
  }

  /**
   * Gets the value of the 'args' field. Optional arguments supplied to
   * compliment and/or justify the response code.
   */
  public java.util.List<java.lang.CharSequence> getArgs() {
    return args;
  }

  /**
   * Sets the value of the 'args' field. Optional arguments supplied to
   * compliment and/or justify the response code. * @param value the value to
   * set.
   */
  public void setArgs(java.util.List<java.lang.CharSequence> value) {
    this.args = (value instanceof org.apache.gora.persistency.Dirtyable) ? value
        : new org.apache.gora.persistency.impl.DirtyListWrapper(value);
    setDirty(1);
  }

  /**
   * Checks the dirty status of the 'args' field. A field is dirty if it
   * represents a change that has not yet been written to the database. Optional
   * arguments supplied to compliment and/or justify the response code. * @param
   * value the value to set.
   */
  public boolean isArgsDirty(java.util.List<java.lang.CharSequence> value) {
    return isDirty(1);
  }

  /**
   * Gets the value of the 'lastModified' field. A server reponse indicating
   * when this page was last modified, this can be unreliable at times hence
   * this is used as a default fall back value for the preferred 'modifiedTime'
   * and 'preModifiedTime' obtained from the WebPage itself.
   */
  public java.lang.Long getLastModified() {
    return lastModified;
  }

  /**
   * Sets the value of the 'lastModified' field. A server reponse indicating
   * when this page was last modified, this can be unreliable at times hence
   * this is used as a default fall back value for the preferred 'modifiedTime'
   * and 'preModifiedTime' obtained from the WebPage itself. * @param value the
   * value to set.
   */
  public void setLastModified(java.lang.Long value) {
    this.lastModified = value;
    setDirty(2);
  }

  /**
   * Checks the dirty status of the 'lastModified' field. A field is dirty if it
   * represents a change that has not yet been written to the database. A server
   * reponse indicating when this page was last modified, this can be unreliable
   * at times hence this is used as a default fall back value for the preferred
   * 'modifiedTime' and 'preModifiedTime' obtained from the WebPage itself. * @param
   * value the value to set.
   */
  public boolean isLastModifiedDirty(java.lang.Long value) {
    return isDirty(2);
  }

  /** Creates a new ProtocolStatus RecordBuilder */
  public static org.apache.nutch.storage.ProtocolStatus.Builder newBuilder() {
    return new org.apache.nutch.storage.ProtocolStatus.Builder();
  }

  /** Creates a new ProtocolStatus RecordBuilder by copying an existing Builder */
  public static org.apache.nutch.storage.ProtocolStatus.Builder newBuilder(
      org.apache.nutch.storage.ProtocolStatus.Builder other) {
    return new org.apache.nutch.storage.ProtocolStatus.Builder(other);
  }

  /**
   * Creates a new ProtocolStatus RecordBuilder by copying an existing
   * ProtocolStatus instance
   */
  public static org.apache.nutch.storage.ProtocolStatus.Builder newBuilder(
      org.apache.nutch.storage.ProtocolStatus other) {
    return new org.apache.nutch.storage.ProtocolStatus.Builder(other);
  }

  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
    int mark = input.position();
    int limit = input.limit();
    input.rewind();
    input.limit(input.capacity());
    copy.put(input);
    input.rewind();
    copy.rewind();
    input.position(mark);
    input.mark();
    copy.position(mark);
    copy.mark();
    input.position(position);
    copy.position(position);
    input.limit(limit);
    copy.limit(limit);
    return copy.asReadOnlyBuffer();
  }

  /**
   * RecordBuilder for ProtocolStatus instances.
   */
  public static class Builder extends
      org.apache.avro.specific.SpecificRecordBuilderBase<ProtocolStatus>
      implements org.apache.avro.data.RecordBuilder<ProtocolStatus> {

    private int code;
    private java.util.List<java.lang.CharSequence> args;
    private long lastModified;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.nutch.storage.ProtocolStatus.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.nutch.storage.ProtocolStatus.Builder other) {
      super(other);
    }

    /** Creates a Builder by copying an existing ProtocolStatus instance */
    private Builder(org.apache.nutch.storage.ProtocolStatus other) {
      super(org.apache.nutch.storage.ProtocolStatus.SCHEMA$);
      if (isValidValue(fields()[0], other.code)) {
        this.code = (java.lang.Integer) data().deepCopy(fields()[0].schema(),
            other.code);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.args)) {
        this.args = (java.util.List<java.lang.CharSequence>) data().deepCopy(
            fields()[1].schema(), other.args);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastModified)) {
        this.lastModified = (java.lang.Long) data().deepCopy(
            fields()[2].schema(), other.lastModified);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'code' field */
    public java.lang.Integer getCode() {
      return code;
    }

    /** Sets the value of the 'code' field */
    public org.apache.nutch.storage.ProtocolStatus.Builder setCode(int value) {
      validate(fields()[0], value);
      this.code = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'code' field has been set */
    public boolean hasCode() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'code' field */
    public org.apache.nutch.storage.ProtocolStatus.Builder clearCode() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'args' field */
    public java.util.List<java.lang.CharSequence> getArgs() {
      return args;
    }

    /** Sets the value of the 'args' field */
    public org.apache.nutch.storage.ProtocolStatus.Builder setArgs(
        java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.args = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'args' field has been set */
    public boolean hasArgs() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'args' field */
    public org.apache.nutch.storage.ProtocolStatus.Builder clearArgs() {
      args = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'lastModified' field */
    public java.lang.Long getLastModified() {
      return lastModified;
    }

    /** Sets the value of the 'lastModified' field */
    public org.apache.nutch.storage.ProtocolStatus.Builder setLastModified(
        long value) {
      validate(fields()[2], value);
      this.lastModified = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'lastModified' field has been set */
    public boolean hasLastModified() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'lastModified' field */
    public org.apache.nutch.storage.ProtocolStatus.Builder clearLastModified() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public ProtocolStatus build() {
      try {
        ProtocolStatus record = new ProtocolStatus();
        record.code = fieldSetFlags()[0] ? this.code
            : (java.lang.Integer) defaultValue(fields()[0]);
        record.args = fieldSetFlags()[1] ? this.args
            : (java.util.List<java.lang.CharSequence>) new org.apache.gora.persistency.impl.DirtyListWrapper(
                (java.util.List) defaultValue(fields()[1]));
        record.lastModified = fieldSetFlags()[2] ? this.lastModified
            : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  public ProtocolStatus.Tombstone getTombstone() {
    return TOMBSTONE;
  }

  public ProtocolStatus newInstance() {
    return newBuilder().build();
  }

  // TODO NUTCH-1709 Generated classes o.a.n.storage.Host and
  // o.a.n.storage.ProtocolStatus contain methods not defined in source .avsc
  /**
   * A convenience method which returns a successful {@link ProtocolStatus}.
   * 
   * @return the {@link ProtocolStatus} value for 200 (success).
   */
  public boolean isSuccess() {
    return code == ProtocolStatusUtils.SUCCESS;
  }

  private static final Tombstone TOMBSTONE = new Tombstone();

  public static final class Tombstone extends ProtocolStatus implements
      org.apache.gora.persistency.Tombstone {

    private Tombstone() {
    }

    /**
     * Gets the value of the 'code' field. A protocol response code which can be
     * one of SUCCESS - content was retrieved without errors, FAILED - Content
     * was not retrieved. Any further errors may be indicated in args,
     * PROTO_NOT_FOUND - This protocol was not found. Application may attempt to
     * retry later, GONE - Resource is gone, MOVED - Resource has moved
     * permanently. New url should be found in args, TEMP_MOVED - Resource has
     * moved temporarily. New url should be found in args., NOTFOUND - Resource
     * was not found, RETRY - Temporary failure. Application may retry
     * immediately., EXCEPTION - Unspecified exception occured. Further
     * information may be provided in args., ACCESS_DENIED - Access denied -
     * authorization required, but missing/incorrect., ROBOTS_DENIED - Access
     * denied by robots.txt rules., REDIR_EXCEEDED - Too many redirects.,
     * NOTFETCHING - Not fetching., NOTMODIFIED - Unchanged since the last
     * fetch., WOULDBLOCK - Request was refused by protocol plugins, because it
     * would block. The expected number of milliseconds to wait before retry may
     * be provided in args., BLOCKED - Thread was blocked http.max.delays times
     * during fetching.
     */
    public java.lang.Integer getCode() {
      throw new java.lang.UnsupportedOperationException(
          "Get is not supported on tombstones");
    }

    /**
     * Sets the value of the 'code' field. A protocol response code which can be
     * one of SUCCESS - content was retrieved without errors, FAILED - Content
     * was not retrieved. Any further errors may be indicated in args,
     * PROTO_NOT_FOUND - This protocol was not found. Application may attempt to
     * retry later, GONE - Resource is gone, MOVED - Resource has moved
     * permanently. New url should be found in args, TEMP_MOVED - Resource has
     * moved temporarily. New url should be found in args., NOTFOUND - Resource
     * was not found, RETRY - Temporary failure. Application may retry
     * immediately., EXCEPTION - Unspecified exception occured. Further
     * information may be provided in args., ACCESS_DENIED - Access denied -
     * authorization required, but missing/incorrect., ROBOTS_DENIED - Access
     * denied by robots.txt rules., REDIR_EXCEEDED - Too many redirects.,
     * NOTFETCHING - Not fetching., NOTMODIFIED - Unchanged since the last
     * fetch., WOULDBLOCK - Request was refused by protocol plugins, because it
     * would block. The expected number of milliseconds to wait before retry may
     * be provided in args., BLOCKED - Thread was blocked http.max.delays times
     * during fetching. * @param value the value to set.
     */
    public void setCode(java.lang.Integer value) {
      throw new java.lang.UnsupportedOperationException(
          "Set is not supported on tombstones");
    }

    /**
     * Checks the dirty status of the 'code' field. A field is dirty if it
     * represents a change that has not yet been written to the database. A
     * protocol response code which can be one of SUCCESS - content was
     * retrieved without errors, FAILED - Content was not retrieved. Any further
     * errors may be indicated in args, PROTO_NOT_FOUND - This protocol was not
     * found. Application may attempt to retry later, GONE - Resource is gone,
     * MOVED - Resource has moved permanently. New url should be found in args,
     * TEMP_MOVED - Resource has moved temporarily. New url should be found in
     * args., NOTFOUND - Resource was not found, RETRY - Temporary failure.
     * Application may retry immediately., EXCEPTION - Unspecified exception
     * occured. Further information may be provided in args., ACCESS_DENIED -
     * Access denied - authorization required, but missing/incorrect.,
     * ROBOTS_DENIED - Access denied by robots.txt rules., REDIR_EXCEEDED - Too
     * many redirects., NOTFETCHING - Not fetching., NOTMODIFIED - Unchanged
     * since the last fetch., WOULDBLOCK - Request was refused by protocol
     * plugins, because it would block. The expected number of milliseconds to
     * wait before retry may be provided in args., BLOCKED - Thread was blocked
     * http.max.delays times during fetching. * @param value the value to set.
     */
    public boolean isCodeDirty(java.lang.Integer value) {
      throw new java.lang.UnsupportedOperationException(
          "IsDirty is not supported on tombstones");
    }

    /**
     * Gets the value of the 'args' field. Optional arguments supplied to
     * compliment and/or justify the response code.
     */
    public java.util.List<java.lang.CharSequence> getArgs() {
      throw new java.lang.UnsupportedOperationException(
          "Get is not supported on tombstones");
    }

    /**
     * Sets the value of the 'args' field. Optional arguments supplied to
     * compliment and/or justify the response code. * @param value the value to
     * set.
     */
    public void setArgs(java.util.List<java.lang.CharSequence> value) {
      throw new java.lang.UnsupportedOperationException(
          "Set is not supported on tombstones");
    }

    /**
     * Checks the dirty status of the 'args' field. A field is dirty if it
     * represents a change that has not yet been written to the database.
     * Optional arguments supplied to compliment and/or justify the response
     * code. * @param value the value to set.
     */
    public boolean isArgsDirty(java.util.List<java.lang.CharSequence> value) {
      throw new java.lang.UnsupportedOperationException(
          "IsDirty is not supported on tombstones");
    }

    /**
     * Gets the value of the 'lastModified' field. A server reponse indicating
     * when this page was last modified, this can be unreliable at times hence
     * this is used as a default fall back value for the preferred
     * 'modifiedTime' and 'preModifiedTime' obtained from the WebPage itself.
     */
    public java.lang.Long getLastModified() {
      throw new java.lang.UnsupportedOperationException(
          "Get is not supported on tombstones");
    }

    /**
     * Sets the value of the 'lastModified' field. A server reponse indicating
     * when this page was last modified, this can be unreliable at times hence
     * this is used as a default fall back value for the preferred
     * 'modifiedTime' and 'preModifiedTime' obtained from the WebPage itself. * @param
     * value the value to set.
     */
    public void setLastModified(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException(
          "Set is not supported on tombstones");
    }

    /**
     * Checks the dirty status of the 'lastModified' field. A field is dirty if
     * it represents a change that has not yet been written to the database. A
     * server reponse indicating when this page was last modified, this can be
     * unreliable at times hence this is used as a default fall back value for
     * the preferred 'modifiedTime' and 'preModifiedTime' obtained from the
     * WebPage itself. * @param value the value to set.
     */
    public boolean isLastModifiedDirty(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException(
          "IsDirty is not supported on tombstones");
    }

  }

}
