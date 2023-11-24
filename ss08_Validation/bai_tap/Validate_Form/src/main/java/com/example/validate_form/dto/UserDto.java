package com.example.validate_form.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Validator {
    private String firstName;

    private String lastName;

    private String phoneNumber;

    private LocalDate age;
    
    private String email;


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        LocalDate curDate = LocalDate.now();
        UserDto userDto = (UserDto) target;
        if("".equals(userDto.getFirstName())){
            errors.rejectValue("firstName", null, "* Họ không được để trống");
        } else if (!userDto.getFirstName().matches("^[A-z][a-z]+")) {
            errors.rejectValue("firstName", null, "* Vui lòng nhập họ thật của bạn");
        }
        if ("".equals(userDto.getLastName())) {
            errors.rejectValue("lastName", null, "* Tên không được để trống");
        } else if (!userDto.getLastName().matches("^[A-z][a-z]+")) {
            errors.rejectValue("lastName", null, "* Vui lòng nhập tên thật của bạn");
        }
        if(!userDto.getPhoneNumber().matches("^0[0-9]{9}")){
            errors.rejectValue("phoneNumber", null, "* Số đện thoại bạn vừa nhập không hợp lệ");
        }

        if (userDto.getAge() == null) {
            errors.rejectValue("age", null, "* Vui lòng nhập ngày sinh");
        } else if (curDate.getYear() - userDto.getAge().getYear() < 18) {
        errors.rejectValue("age", null, "* Vui lòng không sử dụng dịch vụ của chúng tôi nếu bạn chưa đủ 18 tuổi");
        }
        
        if("".equals(userDto.getEmail())){
            errors.rejectValue("email", null, "* Email không được để trống");
        } else if (!userDto.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            errors.rejectValue("email", null, "* Email không đúng định dạng");
        }

    }
}
