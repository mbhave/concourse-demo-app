package com.example.leftpad;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PaddingServiceTests {

	private PaddingService service = new PaddingService();

	@Test
	public void padwithZeroesShouldAddZeroesTillLengthIs8() {
		assertThat(this.service.padWithZeroes("hi")).isEqualTo("000000hi");
		assertThat(this.service.padWithZeroes("hello")).isEqualTo("000hello");
	}

}