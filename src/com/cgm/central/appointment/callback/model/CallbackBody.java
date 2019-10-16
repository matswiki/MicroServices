package com.cgm.central.appointment.callback.model;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * CallbackBody
 */

public class CallbackBody   {
  @JsonProperty("appointmentid")
  private String appointmentid;

  /**
   * Indicates whether the callback is a status change or receipt of a form
   */
  public enum TypeEnum {
    STATUS("status"),
    
    FORM("form");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  /**
   * Only populated when the callback is of type 'status'. Shows the status of the appointment such as whether the appointment has been confirmed/the patient informed
   */
  public enum StatusEnum {
    SENT("sent"),
    
    CONFIRMED("confirmed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("form")
  private FormBody form;

  public CallbackBody appointmentid(String appointmentid) {
    this.appointmentid = appointmentid;
    return this;
  }

  /**
   * Appointment ID for which the asynchronous callback has been sent
   * @return appointmentid
  */
  @ApiModelProperty(example = "-LonwHc2WrhpnwxxNhNg", required = true, value = "Appointment ID for which the asynchronous callback has been sent")
  @NotNull


  public String getAppointmentid() {
    return appointmentid;
  }

  public void setAppointmentid(String appointmentid) {
    this.appointmentid = appointmentid;
  }

  public CallbackBody type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates whether the callback is a status change or receipt of a form
   * @return type
  */
  @ApiModelProperty(example = "status", required = true, value = "Indicates whether the callback is a status change or receipt of a form")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CallbackBody status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Only populated when the callback is of type 'status'. Shows the status of the appointment such as whether the appointment has been confirmed/the patient informed
   * @return status
  */
  @ApiModelProperty(example = "confirmed", value = "Only populated when the callback is of type 'status'. Shows the status of the appointment such as whether the appointment has been confirmed/the patient informed")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CallbackBody form(FormBody form) {
    this.form = form;
    return this;
  }

  /**
   * Get form
   * @return form
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormBody getForm() {
    return form;
  }

  public void setForm(FormBody form) {
    this.form = form;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackBody callbackBody = (CallbackBody) o;
    return Objects.equals(this.appointmentid, callbackBody.appointmentid) &&
        Objects.equals(this.type, callbackBody.type) &&
        Objects.equals(this.status, callbackBody.status) &&
        Objects.equals(this.form, callbackBody.form);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentid, type, status, form);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackBody {\n");
    
    sb.append("    appointmentid: ").append(toIndentedString(appointmentid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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

