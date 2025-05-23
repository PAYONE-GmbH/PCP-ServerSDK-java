package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing data related to the account the customer has with you.
 */
@JsonPropertyOrder({
        CustomerAccount.JSON_PROPERTY_CREATE_DATE
})
public class CustomerAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
    private String createDate;

    public CustomerAccount() {
    }

    public CustomerAccount createDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Creation date and time of the customer account in ISO 8601 format (UTC).
     * Accepted formats are:
     * * YYYY-MM-DD'T'HH:mm:ss'Z'
     * * YYYY-MM-DD'T'HH:mm:ss+XX:XX
     * * YYYY-MM-DD'T'HH:mm:ss-XX:XX
     * * YYYY-MM-DD'T'HH:mm'Z'
     * * YYYY-MM-DD'T'HH:mm+XX:XX
     * * YYYY-MM-DD'T'HH:mm-XX:XX
     * 
     * @return createDate
     **/
    @JsonProperty(JSON_PROPERTY_CREATE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty(JSON_PROPERTY_CREATE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerAccount customerAccount = (CustomerAccount) o;
        return Objects.equals(this.createDate, customerAccount.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerAccount {\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
