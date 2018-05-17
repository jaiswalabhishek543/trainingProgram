package com.example.denom;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

import com.example.exception.MyException;

@Configuration
public class SettingDenomination {

	public void denom(BigDecimal num1) throws MyException {

		Map<Integer, Integer> map = new HashMap<>();

		if (num1.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {
			Integer num = num1.intValue();
			int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
			if (num >= 2000) {
				n1 = num / 2000;
				map.put(2000, n1);
				num = num % 2000;
			}
			if (num >= 500) {
				n2 = num / 500;
				map.put(500, n2);

			}

		} else {

			throw new MyException(" Not a valid amount ");

		}

	}

}
