package by.emall.yatsevich.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class ErrorsDTO {
    private String[] phone;
    private String[] password;

    @Override
    public String toString() {
        if (phone != null && password != null) {
            return phone[0] + "\n" + password[0];
        }
        if (phone == null && password != null) {
            return password[0];
        }
        return phone[0];
    }
}
