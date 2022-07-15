package ems.member.configration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ems.member.DataBaseConnectionInfo;
import ems.member.service.EMSInformationService;



@Configuration
public class PracticeConfig3 {
	@Autowired
	DataBaseConnectionInfo dataBaseConnectionInfoDev;

	@Autowired
	DataBaseConnectionInfo dataBaseConnectionInfoReal;
	
	
	//Information
	@Bean
	public EMSInformationService informationService() {
		EMSInformationService info = new EMSInformationService();
		info.setInfo("Education Management System program was developed in 2015.");
		info.setCopyRight("COPYRIGHT(C) 2015 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");
		info.setVer("The version is 1.0");
		info.setsYear(2015);
		info.setsMonth(1);
		info.setsDay(1);
		info.seteYear(2015);
		info.seteMonth(2);
		info.seteDay(25);

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Cheney.");
		arrayList.add("Eloy.");
		arrayList.add("Jasper.");
		arrayList.add("Dillon.");
		arrayList.add("Kian.");
		info.setDevelopers(arrayList);

		Map<String, String> admin = new HashMap<String, String>();
		admin.put("Cheney", "cheney@springPjt.org");
		admin.put("Jasper", "jasper@springPjt.org");

		info.setAdministrators(admin);

		Map<String, DataBaseConnectionInfo> dbInfos = new HashMap<String, DataBaseConnectionInfo>();
		dbInfos.put("dev", dataBaseConnectionInfoDev);
		dbInfos.put("real", dataBaseConnectionInfoReal);

		info.setDbInfos(dbInfos);

		return info;
	}
}
