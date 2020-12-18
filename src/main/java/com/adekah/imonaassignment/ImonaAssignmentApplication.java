package com.adekah.imonaassignment;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ImonaAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImonaAssignmentApplication.class, args);
	}

	@Bean // burayı araştır!!!
	public ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}
