package com.vis.api.ticket.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vis.api.ticket.model.IssueModel;
import com.vis.api.ticket.model.TicketModel;

@Service
public class TicketService {
	public List<TicketModel> getTicket(String userid) {
		
		List<TicketModel> ticketList = new ArrayList<>();

		TicketModel tickets = new TicketModel();
		tickets.setId("1");
		tickets.setSubject("Recovery for the Bitcoin password");
		tickets.setDesc(
				"User Amit required to recover the bitcoinn password. Contact no 98976576. Email id is amit@gmail.com.");
		tickets.setStatus("Pending");
		tickets.setColorStatus("white");

		List<IssueModel> issues = new ArrayList<>();

		IssueModel issue1 = new IssueModel();
		issue1.setId("1");
		issue1.setSubject("1, Check with user for account ID for Bitcoin.");
		issue1.setDesc("User Amit required give the all account id and specific questionaeries.");
		issue1.setStatus("Completed");
		if(userid.equals("vivek_tailang")) {
			issues.add(issue1);
		}

		IssueModel issue3 = new IssueModel();
		issue3.setId("3");
		issue3.setSubject(
				"3, Communicate with user to get the OTP once it will get generate from system recovery team.");
		issue3.setDesc(
				"Communicate with user to get the OTP once it will get generate from system recovery team. User Amit required give the all account id and specific questionaeries. Communicate with user to get the OTP once it will get generate from system recovery team. User Amit required give the all account id and specific questionaeries. Communicate with user to get the OTP once it will get generate from system recovery team. User Amit required give the all account id and specific questionaeries.");
		issue3.setStatus("Pending");
		issues.add(issue3);

		tickets.setIssues(issues);
		ticketList.add(tickets);

		TicketModel tickets1 = new TicketModel();
		tickets1.setId("2");
		tickets1.setSubject("Recovery for the Etherium password");
		tickets1.setDesc(
				"User Sakshi required to recover the Etherium password. Contact no 8786778. Email id is Sakshi_t@gmail.com.");
		tickets1.setStatus("In Progress");
		tickets1.setColorStatus("white");

		List<IssueModel> issues2 = new ArrayList<>();

		IssueModel issue2 = new IssueModel();
		issue2.setId("2");
		issue2.setSubject("2, Check with user for account it for Etherium.");
		issue2.setDesc("User Sakshi required give the all account id and specific questionaeries.");
		issue2.setStatus("In Progress");
		issues2.add(issue2);

		tickets1.setIssues(issues2);
		ticketList.add(tickets1);

		return ticketList;
	}
}
