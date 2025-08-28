package com.xammer.billops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.xammer.billops.service.BillingService;

@Controller
public class BillingController {

    @Autowired
    private BillingService billingService;
    @GetMapping("/billing")
public String showBillingPage(Model model) {
    model.addAttribute("billingSummary", billingService.getBillingSummary()); 
    
    model.addAttribute("topServicesData", billingService.getTopServicesData());
    model.addAttribute("topRegionsData", billingService.getTopRegionsData());
    model.addAttribute("monthlyConsumptionData", billingService.getMonthlyConsumptionData());
    model.addAttribute("detailedMonthlyBilling", billingService.getDetailedMonthlyBilling("August"));
    return "billing";
}
    
}