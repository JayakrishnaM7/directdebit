package com.ibm.dip.model.internal bank account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountMaintenanceFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-06T11:45:12.393Z[GMT]")

public class AccountMaintenanceFulfillment   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("Postconditions")
  private Object postconditions;

  @JsonProperty("InternalBankAccountLogReference")
  private String internalBankAccountLogReference;

  @JsonProperty("AccountMaintenanceFulfillmentReference")
  private String accountMaintenanceFulfillmentReference;

  @JsonProperty("AccountMaintenanceFulfillmentType")
  private String accountMaintenanceFulfillmentType;

  public AccountMaintenanceFulfillment preconditions(Object preconditions) {
    this.preconditions = preconditions;
    return this;
  }

  /**
   * Get preconditions
   * @return preconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(Object preconditions) {
    this.preconditions = preconditions;
  }

  public AccountMaintenanceFulfillment schedule(Object schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSchedule() {
    return schedule;
  }

  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }

  public AccountMaintenanceFulfillment businessService(Object businessService) {
    this.businessService = businessService;
    return this;
  }

  /**
   * Get businessService
   * @return businessService
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessService() {
    return businessService;
  }

  public void setBusinessService(Object businessService) {
    this.businessService = businessService;
  }

  public AccountMaintenanceFulfillment postconditions(Object postconditions) {
    this.postconditions = postconditions;
    return this;
  }

  /**
   * Get postconditions
   * @return postconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPostconditions() {
    return postconditions;
  }

  public void setPostconditions(Object postconditions) {
    this.postconditions = postconditions;
  }

  public AccountMaintenanceFulfillment internalBankAccountLogReference(String internalBankAccountLogReference) {
    this.internalBankAccountLogReference = internalBankAccountLogReference;
    return this;
  }

  /**
   * Get internalBankAccountLogReference
   * @return internalBankAccountLogReference
  */
  @ApiModelProperty(value = "")


  public String getInternalBankAccountLogReference() {
    return internalBankAccountLogReference;
  }

  public void setInternalBankAccountLogReference(String internalBankAccountLogReference) {
    this.internalBankAccountLogReference = internalBankAccountLogReference;
  }

  public AccountMaintenanceFulfillment accountMaintenanceFulfillmentReference(String accountMaintenanceFulfillmentReference) {
    this.accountMaintenanceFulfillmentReference = accountMaintenanceFulfillmentReference;
    return this;
  }

  /**
   * Get accountMaintenanceFulfillmentReference
   * @return accountMaintenanceFulfillmentReference
  */
  @ApiModelProperty(value = "")


  public String getAccountMaintenanceFulfillmentReference() {
    return accountMaintenanceFulfillmentReference;
  }

  public void setAccountMaintenanceFulfillmentReference(String accountMaintenanceFulfillmentReference) {
    this.accountMaintenanceFulfillmentReference = accountMaintenanceFulfillmentReference;
  }

  public AccountMaintenanceFulfillment accountMaintenanceFulfillmentType(String accountMaintenanceFulfillmentType) {
    this.accountMaintenanceFulfillmentType = accountMaintenanceFulfillmentType;
    return this;
  }

  /**
   * Get accountMaintenanceFulfillmentType
   * @return accountMaintenanceFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getAccountMaintenanceFulfillmentType() {
    return accountMaintenanceFulfillmentType;
  }

  public void setAccountMaintenanceFulfillmentType(String accountMaintenanceFulfillmentType) {
    this.accountMaintenanceFulfillmentType = accountMaintenanceFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMaintenanceFulfillment accountMaintenanceFulfillment = (AccountMaintenanceFulfillment) o;
    return Objects.equals(this.preconditions, accountMaintenanceFulfillment.preconditions) &&
        Objects.equals(this.schedule, accountMaintenanceFulfillment.schedule) &&
        Objects.equals(this.businessService, accountMaintenanceFulfillment.businessService) &&
        Objects.equals(this.postconditions, accountMaintenanceFulfillment.postconditions) &&
        Objects.equals(this.internalBankAccountLogReference, accountMaintenanceFulfillment.internalBankAccountLogReference) &&
        Objects.equals(this.accountMaintenanceFulfillmentReference, accountMaintenanceFulfillment.accountMaintenanceFulfillmentReference) &&
        Objects.equals(this.accountMaintenanceFulfillmentType, accountMaintenanceFulfillment.accountMaintenanceFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, internalBankAccountLogReference, accountMaintenanceFulfillmentReference, accountMaintenanceFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMaintenanceFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    internalBankAccountLogReference: ").append(toIndentedString(internalBankAccountLogReference)).append("\n");
    sb.append("    accountMaintenanceFulfillmentReference: ").append(toIndentedString(accountMaintenanceFulfillmentReference)).append("\n");
    sb.append("    accountMaintenanceFulfillmentType: ").append(toIndentedString(accountMaintenanceFulfillmentType)).append("\n");
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

