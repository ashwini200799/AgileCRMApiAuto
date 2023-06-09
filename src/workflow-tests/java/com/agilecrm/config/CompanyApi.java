package com.agilecrm.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class CompanyApi {
  @Value("${CreateCompany}")
  private String CreateCompany;

  @Value("${ListOfCompany}")
  private String listOfCompany;

  @Value("${DeleteCompany}")
  private String deleteCompany;

  @Value("${GetCompany}")
  private String company;

  @Value("${UpdateCompany}")
  private String updateCompany;


}
