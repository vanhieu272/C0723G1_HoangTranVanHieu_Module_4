package com.example.validate_songs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SongDto implements Validator {
    private String name;
    private String singer;
    private String genre;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SongDto songDto = (SongDto) target;
        if ("".equals(songDto.name.trim())) {
            errors.rejectValue("name", null, "* Không được để trống trường này");
        } else if (songDto.name.trim().length() > 800) {
            errors.rejectValue("name", null, "* Độ dài không thể vượt quá 800 kí tự");
        } else if (!songDto.name.matches("^[a-zA-Z0-9 ]*$")) {
            errors.rejectValue("name", null, "* Tên bài hát không được chứa các kí tự đặc biệt");
        }
        if ("".equals(songDto.singer.trim())) {
            errors.rejectValue("singer", null, "* Không được để trống trường này");
        } else if (songDto.singer.trim().length() > 300) {
            errors.rejectValue("singer", null, "* Độ dài không thể vượt quá 300 kí tự");
        } else if (!songDto.singer.matches("^[a-zA-Z0-9 ]*$")) {
            errors.rejectValue("singer", null, "* Tên nghệ sĩ không được chứa các kí tự đặc biệt");
        }
        if ("".equals(songDto.getGenre().trim())) {
            errors.rejectValue("genre", null, "* Không được để trống trường này");
        } else if (songDto.getGenre().trim().length() > 1000) {
            errors.rejectValue("genre", null, "* * Độ dài không thể vượt quá 1000 kí tự");
        } else if (!songDto.getGenre().matches("^[^,]*$")) {
            errors.rejectValue("genre", null, "* Thể loại không được chứa các ký tự đặc biệt. Các thể loại có thể phân cách nhau bằng dấu phẩy");
        }
    }
}
