package in.ashokit.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {
	
	@NotBlank(message = "username is required")
	private String userName;
	
	@NotBlank(message = "Password is required")
	@Size(min=6 , max=12 , message = "अबे 6 से ले के 12 तक दाल")
	private String userPwd;
	
	@NotBlank(message = "email is required")
	@Email(message = "Enter valid format")
	private String userEmail;
	
	@NotBlank(message = "PhoneNumber is required")
	@Size(min=10 , message = "10 नंबर होना मेरेको")
	private String userPhone;
	
	@NotNull(message = "Age is required")
	@Min(value= 21 , message = "शादी नहीं हो सकती तेरी")
	@Max(value= 60, message = "अब नहीं मिलेगी तुझे")
	private Double userAge;

}
