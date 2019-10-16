package com.cgm.central.appointment.callback.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JSON object containing all the form fields as competed by the patient
 */
@ApiModel(description = "JSON object containing all the form fields as competed by the patient")

public class FormBody   {
  @JsonProperty("Account_payer_email")
  private String accountPayerEmail;

  @JsonProperty("Account_payer_name")
  private String accountPayerName;

  @JsonProperty("Account_payer_phone")
  private String accountPayerPhone;

  @JsonProperty("Account_payer_surname")
  private String accountPayerSurname;

  @JsonProperty("Allergies")
  private String allergies;

  @JsonProperty("City")
  private String city;

  @JsonProperty("Current_medication")
  private String currentMedication;

  @JsonProperty("Date_of_birth")
  private String dateOfBirth;

  @JsonProperty("Email")
  private String email;

  @JsonProperty("First_name")
  private String firstName;

  @JsonProperty("Full_TnC")
  private String fullTnC;

  @JsonProperty("Gender")
  private String gender;

  @JsonProperty("Height")
  private String height;

  @JsonProperty("ID_Passport")
  private String idPassport;

  @JsonProperty("Medical_aid_dependent_number")
  private String medicalAidDependentNumber;

  @JsonProperty("Medical_aid_gap_cover")
  private String medicalAidGapCover;

  @JsonProperty("Medical_aid_main_member_ID_(if_different)")
  private String medicalAidMainMemberIDIfDifferent;

  @JsonProperty("Medical_aid_main_member_name_(if_different)")
  private String medicalAidMainMemberNameIfDifferent;

  @JsonProperty("Medical_aid_main_member_surname_(if_different)")
  private String medicalAidMainMemberSurnameIfDifferent;

  @JsonProperty("Medical_aid_member_number")
  private String medicalAidMemberNumber;

  @JsonProperty("Medical_aid_name")
  private String medicalAidName;

  @JsonProperty("Medical_aid_plan")
  private String medicalAidPlan;

  @JsonProperty("Name_(emergency_contact)")
  private String nameEmergencyContact;

  @JsonProperty("Occupation")
  private String occupation;

  @JsonProperty("PO_address")
  private String poAddress;

  @JsonProperty("PO_city")
  private String poCity;

  @JsonProperty("PO_code")
  private String poCode;

  @JsonProperty("Patient_is_not_account_payer")
  private String patientIsNotAccountPayer;

  @JsonProperty("Phone_(home)")
  private String phoneHome;

  @JsonProperty("Phone_(mobile)")
  private String phoneMobile;

  @JsonProperty("Phone_(work)")
  private String phoneWork;

  @JsonProperty("Phone_number_(emergency_contact)")
  private String phoneNumberEmergencyContact;

  @JsonProperty("Postal_address_differs_from_above")
  private String postalAddressDiffersFromAbove;

  @JsonProperty("Postal_code")
  private String postalCode;

  @JsonProperty("Referrer_Name")
  private String referrerName;

  @JsonProperty("Referrer_Phone")
  private String referrerPhone;

  @JsonProperty("Signature")
  private String signature;

  @JsonProperty("Significant_Family_Medical_History")
  private String significantFamilyMedicalHistory;

  @JsonProperty("Significant_Medical_History")
  private String significantMedicalHistory;

  @JsonProperty("Street")
  private String street;

  @JsonProperty("Suburb")
  private String suburb;

  @JsonProperty("Surname")
  private String surname;

  @JsonProperty("Surname_(emergency_contact)")
  private String surnameEmergencyContact;

  @JsonProperty("Terms_and_Conditions")
  private String termsAndConditions;

  @JsonProperty("Title")
  private String title;

  @JsonProperty("Weight")
  private String weight;

  public FormBody accountPayerEmail(String accountPayerEmail) {
    this.accountPayerEmail = accountPayerEmail;
    return this;
  }

  /**
   * Get accountPayerEmail
   * @return accountPayerEmail
  */
  @ApiModelProperty(example = "main@member.com", value = "")


  public String getAccountPayerEmail() {
    return accountPayerEmail;
  }

  public void setAccountPayerEmail(String accountPayerEmail) {
    this.accountPayerEmail = accountPayerEmail;
  }

  public FormBody accountPayerName(String accountPayerName) {
    this.accountPayerName = accountPayerName;
    return this;
  }

  /**
   * Get accountPayerName
   * @return accountPayerName
  */
  @ApiModelProperty(example = "Mainname", value = "")


  public String getAccountPayerName() {
    return accountPayerName;
  }

  public void setAccountPayerName(String accountPayerName) {
    this.accountPayerName = accountPayerName;
  }

  public FormBody accountPayerPhone(String accountPayerPhone) {
    this.accountPayerPhone = accountPayerPhone;
    return this;
  }

  /**
   * Get accountPayerPhone
   * @return accountPayerPhone
  */
  @ApiModelProperty(example = "012345667789", value = "")


  public String getAccountPayerPhone() {
    return accountPayerPhone;
  }

  public void setAccountPayerPhone(String accountPayerPhone) {
    this.accountPayerPhone = accountPayerPhone;
  }

  public FormBody accountPayerSurname(String accountPayerSurname) {
    this.accountPayerSurname = accountPayerSurname;
    return this;
  }

  /**
   * Get accountPayerSurname
   * @return accountPayerSurname
  */
  @ApiModelProperty(example = "Mainsurname", value = "")


  public String getAccountPayerSurname() {
    return accountPayerSurname;
  }

  public void setAccountPayerSurname(String accountPayerSurname) {
    this.accountPayerSurname = accountPayerSurname;
  }

  public FormBody allergies(String allergies) {
    this.allergies = allergies;
    return this;
  }

  /**
   * Get allergies
   * @return allergies
  */
  @ApiModelProperty(example = "Olives", value = "")


  public String getAllergies() {
    return allergies;
  }

  public void setAllergies(String allergies) {
    this.allergies = allergies;
  }

  public FormBody city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(example = "Cape Town", value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public FormBody currentMedication(String currentMedication) {
    this.currentMedication = currentMedication;
    return this;
  }

  /**
   * Get currentMedication
   * @return currentMedication
  */
  @ApiModelProperty(example = "Antihestamine", value = "")


  public String getCurrentMedication() {
    return currentMedication;
  }

  public void setCurrentMedication(String currentMedication) {
    this.currentMedication = currentMedication;
  }

  public FormBody dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(example = "1985-03-15", value = "")


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public FormBody email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(example = "jmloubser@gmail.com", value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public FormBody firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(example = "Morne", value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public FormBody fullTnC(String fullTnC) {
    this.fullTnC = fullTnC;
    return this;
  }

  /**
   * Get fullTnC
   * @return fullTnC
  */
  @ApiModelProperty(example = "By signing you agree to ...", value = "")


  public String getFullTnC() {
    return fullTnC;
  }

  public void setFullTnC(String fullTnC) {
    this.fullTnC = fullTnC;
  }

  public FormBody gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(example = "Male", value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public FormBody height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @ApiModelProperty(example = "180", value = "")


  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public FormBody idPassport(String idPassport) {
    this.idPassport = idPassport;
    return this;
  }

  /**
   * Get idPassport
   * @return idPassport
  */
  @ApiModelProperty(example = "1234567890123", value = "")


  public String getIdPassport() {
    return idPassport;
  }

  public void setIdPassport(String idPassport) {
    this.idPassport = idPassport;
  }

  public FormBody medicalAidDependentNumber(String medicalAidDependentNumber) {
    this.medicalAidDependentNumber = medicalAidDependentNumber;
    return this;
  }

  /**
   * Get medicalAidDependentNumber
   * @return medicalAidDependentNumber
  */
  @ApiModelProperty(example = "2", value = "")


  public String getMedicalAidDependentNumber() {
    return medicalAidDependentNumber;
  }

  public void setMedicalAidDependentNumber(String medicalAidDependentNumber) {
    this.medicalAidDependentNumber = medicalAidDependentNumber;
  }

  public FormBody medicalAidGapCover(String medicalAidGapCover) {
    this.medicalAidGapCover = medicalAidGapCover;
    return this;
  }

  /**
   * Get medicalAidGapCover
   * @return medicalAidGapCover
  */
  @ApiModelProperty(example = "No", value = "")


  public String getMedicalAidGapCover() {
    return medicalAidGapCover;
  }

  public void setMedicalAidGapCover(String medicalAidGapCover) {
    this.medicalAidGapCover = medicalAidGapCover;
  }

  public FormBody medicalAidMainMemberIDIfDifferent(String medicalAidMainMemberIDIfDifferent) {
    this.medicalAidMainMemberIDIfDifferent = medicalAidMainMemberIDIfDifferent;
    return this;
  }

  /**
   * Get medicalAidMainMemberIDIfDifferent
   * @return medicalAidMainMemberIDIfDifferent
  */
  @ApiModelProperty(example = "1234567890", value = "")


  public String getMedicalAidMainMemberIDIfDifferent() {
    return medicalAidMainMemberIDIfDifferent;
  }

  public void setMedicalAidMainMemberIDIfDifferent(String medicalAidMainMemberIDIfDifferent) {
    this.medicalAidMainMemberIDIfDifferent = medicalAidMainMemberIDIfDifferent;
  }

  public FormBody medicalAidMainMemberNameIfDifferent(String medicalAidMainMemberNameIfDifferent) {
    this.medicalAidMainMemberNameIfDifferent = medicalAidMainMemberNameIfDifferent;
    return this;
  }

  /**
   * Get medicalAidMainMemberNameIfDifferent
   * @return medicalAidMainMemberNameIfDifferent
  */
  @ApiModelProperty(example = "Mainname", value = "")


  public String getMedicalAidMainMemberNameIfDifferent() {
    return medicalAidMainMemberNameIfDifferent;
  }

  public void setMedicalAidMainMemberNameIfDifferent(String medicalAidMainMemberNameIfDifferent) {
    this.medicalAidMainMemberNameIfDifferent = medicalAidMainMemberNameIfDifferent;
  }

  public FormBody medicalAidMainMemberSurnameIfDifferent(String medicalAidMainMemberSurnameIfDifferent) {
    this.medicalAidMainMemberSurnameIfDifferent = medicalAidMainMemberSurnameIfDifferent;
    return this;
  }

  /**
   * Get medicalAidMainMemberSurnameIfDifferent
   * @return medicalAidMainMemberSurnameIfDifferent
  */
  @ApiModelProperty(example = "Mainsurname", value = "")


  public String getMedicalAidMainMemberSurnameIfDifferent() {
    return medicalAidMainMemberSurnameIfDifferent;
  }

  public void setMedicalAidMainMemberSurnameIfDifferent(String medicalAidMainMemberSurnameIfDifferent) {
    this.medicalAidMainMemberSurnameIfDifferent = medicalAidMainMemberSurnameIfDifferent;
  }

  public FormBody medicalAidMemberNumber(String medicalAidMemberNumber) {
    this.medicalAidMemberNumber = medicalAidMemberNumber;
    return this;
  }

  /**
   * Get medicalAidMemberNumber
   * @return medicalAidMemberNumber
  */
  @ApiModelProperty(example = "B123456789", value = "")


  public String getMedicalAidMemberNumber() {
    return medicalAidMemberNumber;
  }

  public void setMedicalAidMemberNumber(String medicalAidMemberNumber) {
    this.medicalAidMemberNumber = medicalAidMemberNumber;
  }

  public FormBody medicalAidName(String medicalAidName) {
    this.medicalAidName = medicalAidName;
    return this;
  }

  /**
   * Get medicalAidName
   * @return medicalAidName
  */
  @ApiModelProperty(example = "GetBetter Medical Aid", value = "")


  public String getMedicalAidName() {
    return medicalAidName;
  }

  public void setMedicalAidName(String medicalAidName) {
    this.medicalAidName = medicalAidName;
  }

  public FormBody medicalAidPlan(String medicalAidPlan) {
    this.medicalAidPlan = medicalAidPlan;
    return this;
  }

  /**
   * Get medicalAidPlan
   * @return medicalAidPlan
  */
  @ApiModelProperty(example = "Coastal Plan", value = "")


  public String getMedicalAidPlan() {
    return medicalAidPlan;
  }

  public void setMedicalAidPlan(String medicalAidPlan) {
    this.medicalAidPlan = medicalAidPlan;
  }

  public FormBody nameEmergencyContact(String nameEmergencyContact) {
    this.nameEmergencyContact = nameEmergencyContact;
    return this;
  }

  /**
   * Get nameEmergencyContact
   * @return nameEmergencyContact
  */
  @ApiModelProperty(example = "Mainname", value = "")


  public String getNameEmergencyContact() {
    return nameEmergencyContact;
  }

  public void setNameEmergencyContact(String nameEmergencyContact) {
    this.nameEmergencyContact = nameEmergencyContact;
  }

  public FormBody occupation(String occupation) {
    this.occupation = occupation;
    return this;
  }

  /**
   * Get occupation
   * @return occupation
  */
  @ApiModelProperty(example = "Developer", value = "")


  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public FormBody poAddress(String poAddress) {
    this.poAddress = poAddress;
    return this;
  }

  /**
   * Get poAddress
   * @return poAddress
  */
  @ApiModelProperty(example = "PO Box 123", value = "")


  public String getPoAddress() {
    return poAddress;
  }

  public void setPoAddress(String poAddress) {
    this.poAddress = poAddress;
  }

  public FormBody poCity(String poCity) {
    this.poCity = poCity;
    return this;
  }

  /**
   * Get poCity
   * @return poCity
  */
  @ApiModelProperty(example = "Cape Town", value = "")


  public String getPoCity() {
    return poCity;
  }

  public void setPoCity(String poCity) {
    this.poCity = poCity;
  }

  public FormBody poCode(String poCode) {
    this.poCode = poCode;
    return this;
  }

  /**
   * Get poCode
   * @return poCode
  */
  @ApiModelProperty(example = "8000", value = "")


  public String getPoCode() {
    return poCode;
  }

  public void setPoCode(String poCode) {
    this.poCode = poCode;
  }

  public FormBody patientIsNotAccountPayer(String patientIsNotAccountPayer) {
    this.patientIsNotAccountPayer = patientIsNotAccountPayer;
    return this;
  }

  /**
   * Get patientIsNotAccountPayer
   * @return patientIsNotAccountPayer
  */
  @ApiModelProperty(example = "true", value = "")


  public String getPatientIsNotAccountPayer() {
    return patientIsNotAccountPayer;
  }

  public void setPatientIsNotAccountPayer(String patientIsNotAccountPayer) {
    this.patientIsNotAccountPayer = patientIsNotAccountPayer;
  }

  public FormBody phoneHome(String phoneHome) {
    this.phoneHome = phoneHome;
    return this;
  }

  /**
   * Get phoneHome
   * @return phoneHome
  */
  @ApiModelProperty(example = "0987654322", value = "")


  public String getPhoneHome() {
    return phoneHome;
  }

  public void setPhoneHome(String phoneHome) {
    this.phoneHome = phoneHome;
  }

  public FormBody phoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
    return this;
  }

  /**
   * Get phoneMobile
   * @return phoneMobile
  */
  @ApiModelProperty(example = "0123456789", value = "")


  public String getPhoneMobile() {
    return phoneMobile;
  }

  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }

  public FormBody phoneWork(String phoneWork) {
    this.phoneWork = phoneWork;
    return this;
  }

  /**
   * Get phoneWork
   * @return phoneWork
  */
  @ApiModelProperty(example = "0987654321", value = "")


  public String getPhoneWork() {
    return phoneWork;
  }

  public void setPhoneWork(String phoneWork) {
    this.phoneWork = phoneWork;
  }

  public FormBody phoneNumberEmergencyContact(String phoneNumberEmergencyContact) {
    this.phoneNumberEmergencyContact = phoneNumberEmergencyContact;
    return this;
  }

  /**
   * Get phoneNumberEmergencyContact
   * @return phoneNumberEmergencyContact
  */
  @ApiModelProperty(example = "01234567890", value = "")


  public String getPhoneNumberEmergencyContact() {
    return phoneNumberEmergencyContact;
  }

  public void setPhoneNumberEmergencyContact(String phoneNumberEmergencyContact) {
    this.phoneNumberEmergencyContact = phoneNumberEmergencyContact;
  }

  public FormBody postalAddressDiffersFromAbove(String postalAddressDiffersFromAbove) {
    this.postalAddressDiffersFromAbove = postalAddressDiffersFromAbove;
    return this;
  }

  /**
   * Get postalAddressDiffersFromAbove
   * @return postalAddressDiffersFromAbove
  */
  @ApiModelProperty(example = "true", value = "")


  public String getPostalAddressDiffersFromAbove() {
    return postalAddressDiffersFromAbove;
  }

  public void setPostalAddressDiffersFromAbove(String postalAddressDiffersFromAbove) {
    this.postalAddressDiffersFromAbove = postalAddressDiffersFromAbove;
  }

  public FormBody postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  */
  @ApiModelProperty(example = "8000", value = "")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public FormBody referrerName(String referrerName) {
    this.referrerName = referrerName;
    return this;
  }

  /**
   * Get referrerName
   * @return referrerName
  */
  @ApiModelProperty(example = "Dr Strange", value = "")


  public String getReferrerName() {
    return referrerName;
  }

  public void setReferrerName(String referrerName) {
    this.referrerName = referrerName;
  }

  public FormBody referrerPhone(String referrerPhone) {
    this.referrerPhone = referrerPhone;
    return this;
  }

  /**
   * Get referrerPhone
   * @return referrerPhone
  */
  @ApiModelProperty(example = "0987654333", value = "")


  public String getReferrerPhone() {
    return referrerPhone;
  }

  public void setReferrerPhone(String referrerPhone) {
    this.referrerPhone = referrerPhone;
  }

  public FormBody signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
  */
  @ApiModelProperty(example = "true", value = "")


  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public FormBody significantFamilyMedicalHistory(String significantFamilyMedicalHistory) {
    this.significantFamilyMedicalHistory = significantFamilyMedicalHistory;
    return this;
  }

  /**
   * Get significantFamilyMedicalHistory
   * @return significantFamilyMedicalHistory
  */
  @ApiModelProperty(example = "Diabetes (grandfather)", value = "")


  public String getSignificantFamilyMedicalHistory() {
    return significantFamilyMedicalHistory;
  }

  public void setSignificantFamilyMedicalHistory(String significantFamilyMedicalHistory) {
    this.significantFamilyMedicalHistory = significantFamilyMedicalHistory;
  }

  public FormBody significantMedicalHistory(String significantMedicalHistory) {
    this.significantMedicalHistory = significantMedicalHistory;
    return this;
  }

  /**
   * Get significantMedicalHistory
   * @return significantMedicalHistory
  */
  @ApiModelProperty(example = "Hip replacement", value = "")


  public String getSignificantMedicalHistory() {
    return significantMedicalHistory;
  }

  public void setSignificantMedicalHistory(String significantMedicalHistory) {
    this.significantMedicalHistory = significantMedicalHistory;
  }

  public FormBody street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  @ApiModelProperty(example = "1 Strand Street", value = "")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public FormBody suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

  /**
   * Get suburb
   * @return suburb
  */
  @ApiModelProperty(example = "Cape Town City Center", value = "")


  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public FormBody surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(example = "Loubser", value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public FormBody surnameEmergencyContact(String surnameEmergencyContact) {
    this.surnameEmergencyContact = surnameEmergencyContact;
    return this;
  }

  /**
   * Get surnameEmergencyContact
   * @return surnameEmergencyContact
  */
  @ApiModelProperty(example = "Mainsurname", value = "")


  public String getSurnameEmergencyContact() {
    return surnameEmergencyContact;
  }

  public void setSurnameEmergencyContact(String surnameEmergencyContact) {
    this.surnameEmergencyContact = surnameEmergencyContact;
  }

  public FormBody termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  /**
   * Get termsAndConditions
   * @return termsAndConditions
  */
  @ApiModelProperty(example = "Agreed", value = "")


  public String getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public FormBody title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(example = "Mr", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FormBody weight(String weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  @ApiModelProperty(example = "70", value = "")


  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormBody formBody = (FormBody) o;
    return Objects.equals(this.accountPayerEmail, formBody.accountPayerEmail) &&
        Objects.equals(this.accountPayerName, formBody.accountPayerName) &&
        Objects.equals(this.accountPayerPhone, formBody.accountPayerPhone) &&
        Objects.equals(this.accountPayerSurname, formBody.accountPayerSurname) &&
        Objects.equals(this.allergies, formBody.allergies) &&
        Objects.equals(this.city, formBody.city) &&
        Objects.equals(this.currentMedication, formBody.currentMedication) &&
        Objects.equals(this.dateOfBirth, formBody.dateOfBirth) &&
        Objects.equals(this.email, formBody.email) &&
        Objects.equals(this.firstName, formBody.firstName) &&
        Objects.equals(this.fullTnC, formBody.fullTnC) &&
        Objects.equals(this.gender, formBody.gender) &&
        Objects.equals(this.height, formBody.height) &&
        Objects.equals(this.idPassport, formBody.idPassport) &&
        Objects.equals(this.medicalAidDependentNumber, formBody.medicalAidDependentNumber) &&
        Objects.equals(this.medicalAidGapCover, formBody.medicalAidGapCover) &&
        Objects.equals(this.medicalAidMainMemberIDIfDifferent, formBody.medicalAidMainMemberIDIfDifferent) &&
        Objects.equals(this.medicalAidMainMemberNameIfDifferent, formBody.medicalAidMainMemberNameIfDifferent) &&
        Objects.equals(this.medicalAidMainMemberSurnameIfDifferent, formBody.medicalAidMainMemberSurnameIfDifferent) &&
        Objects.equals(this.medicalAidMemberNumber, formBody.medicalAidMemberNumber) &&
        Objects.equals(this.medicalAidName, formBody.medicalAidName) &&
        Objects.equals(this.medicalAidPlan, formBody.medicalAidPlan) &&
        Objects.equals(this.nameEmergencyContact, formBody.nameEmergencyContact) &&
        Objects.equals(this.occupation, formBody.occupation) &&
        Objects.equals(this.poAddress, formBody.poAddress) &&
        Objects.equals(this.poCity, formBody.poCity) &&
        Objects.equals(this.poCode, formBody.poCode) &&
        Objects.equals(this.patientIsNotAccountPayer, formBody.patientIsNotAccountPayer) &&
        Objects.equals(this.phoneHome, formBody.phoneHome) &&
        Objects.equals(this.phoneMobile, formBody.phoneMobile) &&
        Objects.equals(this.phoneWork, formBody.phoneWork) &&
        Objects.equals(this.phoneNumberEmergencyContact, formBody.phoneNumberEmergencyContact) &&
        Objects.equals(this.postalAddressDiffersFromAbove, formBody.postalAddressDiffersFromAbove) &&
        Objects.equals(this.postalCode, formBody.postalCode) &&
        Objects.equals(this.referrerName, formBody.referrerName) &&
        Objects.equals(this.referrerPhone, formBody.referrerPhone) &&
        Objects.equals(this.signature, formBody.signature) &&
        Objects.equals(this.significantFamilyMedicalHistory, formBody.significantFamilyMedicalHistory) &&
        Objects.equals(this.significantMedicalHistory, formBody.significantMedicalHistory) &&
        Objects.equals(this.street, formBody.street) &&
        Objects.equals(this.suburb, formBody.suburb) &&
        Objects.equals(this.surname, formBody.surname) &&
        Objects.equals(this.surnameEmergencyContact, formBody.surnameEmergencyContact) &&
        Objects.equals(this.termsAndConditions, formBody.termsAndConditions) &&
        Objects.equals(this.title, formBody.title) &&
        Objects.equals(this.weight, formBody.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPayerEmail, accountPayerName, accountPayerPhone, accountPayerSurname, allergies, city, currentMedication, dateOfBirth, email, firstName, fullTnC, gender, height, idPassport, medicalAidDependentNumber, medicalAidGapCover, medicalAidMainMemberIDIfDifferent, medicalAidMainMemberNameIfDifferent, medicalAidMainMemberSurnameIfDifferent, medicalAidMemberNumber, medicalAidName, medicalAidPlan, nameEmergencyContact, occupation, poAddress, poCity, poCode, patientIsNotAccountPayer, phoneHome, phoneMobile, phoneWork, phoneNumberEmergencyContact, postalAddressDiffersFromAbove, postalCode, referrerName, referrerPhone, signature, significantFamilyMedicalHistory, significantMedicalHistory, street, suburb, surname, surnameEmergencyContact, termsAndConditions, title, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormBody {\n");
    
    sb.append("    accountPayerEmail: ").append(toIndentedString(accountPayerEmail)).append("\n");
    sb.append("    accountPayerName: ").append(toIndentedString(accountPayerName)).append("\n");
    sb.append("    accountPayerPhone: ").append(toIndentedString(accountPayerPhone)).append("\n");
    sb.append("    accountPayerSurname: ").append(toIndentedString(accountPayerSurname)).append("\n");
    sb.append("    allergies: ").append(toIndentedString(allergies)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    currentMedication: ").append(toIndentedString(currentMedication)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullTnC: ").append(toIndentedString(fullTnC)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    idPassport: ").append(toIndentedString(idPassport)).append("\n");
    sb.append("    medicalAidDependentNumber: ").append(toIndentedString(medicalAidDependentNumber)).append("\n");
    sb.append("    medicalAidGapCover: ").append(toIndentedString(medicalAidGapCover)).append("\n");
    sb.append("    medicalAidMainMemberIDIfDifferent: ").append(toIndentedString(medicalAidMainMemberIDIfDifferent)).append("\n");
    sb.append("    medicalAidMainMemberNameIfDifferent: ").append(toIndentedString(medicalAidMainMemberNameIfDifferent)).append("\n");
    sb.append("    medicalAidMainMemberSurnameIfDifferent: ").append(toIndentedString(medicalAidMainMemberSurnameIfDifferent)).append("\n");
    sb.append("    medicalAidMemberNumber: ").append(toIndentedString(medicalAidMemberNumber)).append("\n");
    sb.append("    medicalAidName: ").append(toIndentedString(medicalAidName)).append("\n");
    sb.append("    medicalAidPlan: ").append(toIndentedString(medicalAidPlan)).append("\n");
    sb.append("    nameEmergencyContact: ").append(toIndentedString(nameEmergencyContact)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    poAddress: ").append(toIndentedString(poAddress)).append("\n");
    sb.append("    poCity: ").append(toIndentedString(poCity)).append("\n");
    sb.append("    poCode: ").append(toIndentedString(poCode)).append("\n");
    sb.append("    patientIsNotAccountPayer: ").append(toIndentedString(patientIsNotAccountPayer)).append("\n");
    sb.append("    phoneHome: ").append(toIndentedString(phoneHome)).append("\n");
    sb.append("    phoneMobile: ").append(toIndentedString(phoneMobile)).append("\n");
    sb.append("    phoneWork: ").append(toIndentedString(phoneWork)).append("\n");
    sb.append("    phoneNumberEmergencyContact: ").append(toIndentedString(phoneNumberEmergencyContact)).append("\n");
    sb.append("    postalAddressDiffersFromAbove: ").append(toIndentedString(postalAddressDiffersFromAbove)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    referrerName: ").append(toIndentedString(referrerName)).append("\n");
    sb.append("    referrerPhone: ").append(toIndentedString(referrerPhone)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    significantFamilyMedicalHistory: ").append(toIndentedString(significantFamilyMedicalHistory)).append("\n");
    sb.append("    significantMedicalHistory: ").append(toIndentedString(significantMedicalHistory)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    surnameEmergencyContact: ").append(toIndentedString(surnameEmergencyContact)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

