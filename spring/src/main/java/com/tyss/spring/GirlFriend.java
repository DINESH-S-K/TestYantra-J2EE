package com.tyss.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GirlFriend {
	private String fullName;
	private String phoneNumber;
	private String instaId;
	private String bestQuality;
    private BoyFriend boyfriend;
}
