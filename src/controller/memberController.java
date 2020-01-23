package controller;



import java.util.List;

import model.Address;
import model.Book;
import model.CheckOutRecord;
import model.Librarian;
import model.Member;

public class memberController {

private List<Member> memberList;
//TODO
 public void saveMembers()
 {
	 
 }
	public void loadMemberList(){
		// TO DO
	//	memberList = DataStore.getMemberList();
	}
	public memberController() {
		this.memberList = getMemberList();
	}
	void addLibraryMember(Member m)
	{
		memberList.add(m);
	}
	
	public boolean MemberInList(int memNo) {
		for(Member m:memberList)
			if(m.getMemNO() == memNo)
				return true;
		
		return false;
	}
	//USE CASE 1
	void addLibraryMember(int memNo, String firstName, String lastName, String tel, Address addr)
	{
		if(!MemberInList(memNo))
		{	
			Member m = new Member(memNo, firstName, lastName, tel, addr);
		
			memberList.add(m);
			saveMembers();
		}
		else
		{
			System.out.println("Member with id: " + memNo+  "already exists");
			return;
		}
		//TODO
	saveMembers();
	}
	
	public Member getMember(int memNo)
	{
		for(Member m:memberList)
			if(m.getMemNO() == memNo)
				return m;
		
		
		
		return null;
	}
	
	void removeMember(int memNo)
	{
		
		if(!MemberInList(memNo))
			System.out.println("Member with id: " + memNo+  "do not exist");
		
		memberList.remove(getMember(memNo));
		//TODO
		saveMembers();
			
	}
	void editMemberFirstName(int memNo,String newFirstName)
	{
		Member m = getMember(memNo);
		if(m!=null)
			m.setFirstName(newFirstName);
		//TODO
		saveMembers();
	}
	
	void editMemberLastName(int memNo,String newLastName)
	{
		Member m = getMember(memNo);
		if(m!=null)
			m.setLastName(newLastName);
		//TODO
		saveMembers();
	}
	void editMemberTelephone(int memNo,String newTelephone)
	{
		Member m = getMember(memNo);
		if(m!=null)
			m.setLastName(newTelephone);
		//TODO
		saveMembers();
	}
	
	public List<CheckOutRecord> getMemberCheckoutRecord(int memNo)
	{
		Member m = getMember(memNo);
		if(m!=null)
			return m.getCheckOutRecords();
		
		return null;
	}


	
	
}
