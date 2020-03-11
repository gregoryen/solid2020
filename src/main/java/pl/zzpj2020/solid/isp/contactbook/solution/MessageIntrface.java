package pl.zzpj2020.solid.isp.contactbook.solution;

class MessageIntrface {
	
	Emailer emailer;
	Dialler dialler;

	public MessageIntrface() {
		emailer = new Emailer();
		dialler = new Dialler();
	}

	public void contactPeople(Contact contact) {
		emailer.sendMessage(contact, "promocja", "tanio dzisiaj!");
		dialler.makeCall(contact);
	}
	

}
