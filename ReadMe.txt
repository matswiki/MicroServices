Central Calendar Callback Handler

Introduction

This REST service is called by the third party to update the appointment that was previously booked.
The end-point of the service is specified in the callbackurl section of the appointment creation request.
 
Request JSON

{
    "appointmentid" : "-LolAVt3k6YZ9mxXsFf3",
    "type" : "status",
    "status":"sent",
    "form": {
       "Account_payer_email" : "martin.majoro@cgm.com", 
       "Account_payer_name" : " ", 
       "Account_payer_phone" : " ", 
       "Account_payer_surname" : " ", 
       "Allergies" : " ", 
       "City" : " ", 
       "Current_medication" : " ", 
       "Date_of_birth" : " ", 
       "Email" : " ", 
       "First_name" : " ", 
       "Full_TnC" : " ", 
       "Gender" : " ", 
       "Height" : " ", 
       "ID_Passport" : " ", 
       "Medical_aid_dependent_number" : " ", 
       "Medical_aid_gap_cover" : " ", 
       "Medical_aid_main_member_ID_(if_different)" : " ", 
       "Medical_aid_main_member_name_(if_different)" : " ", 
       "Medical_aid_main_member_surname_(if_different)" : " ", 
       "Medical_aid_member_number" : " ", 
       "Medical_aid_name" : " ", 
       "Medical_aid_plan" : " ", 
       "Name_(emergency_contact)" : " ", 
       "Occupation" : " ", 
       "PO_address" : " ", 
       "PO_city" : " ", 
       "PO_code" : " ", 
       "Patient_is_not_account_payer" : " ", 
       "Phone_(home)" : " ", 
       "Phone_(mobile)" : " ", 
       "Phone_(work)" : " ", 
       "Phone_number_(emergency_contact)" : " ", 
       "Postal_address_differs_from_above" : " ", 
       "Postal_code" : " ", 
       "Referrer_Name" : " ", 
       "Referrer_Phone" : " ", 
       "Signature" : " ", 
       "Significant_Family_Medical_History" : " ", 
       "Significant_Medical_History" : " ", 
       "Street" : " ", 
       "Suburb" : " ", 
       "Surname" : " ", 
       "Surname_(emergency_contact)" : " ", 
       "Terms_and_Conditions" : " ", 
       "Title" : " ", 
       "Weight" : " "
	}
}

Response JSON
