package com.team3.models;

public class Cliente {
		private String name;
		private String mail;
		private String phone;
		private String adress;
		private float credit;
		
		public Cliente(String name,String mail,String phone,String adress,float credit) {
			super();
			this.name= name;
			this.mail= mail;
			this.phone= phone;
			this.adress= adress;
			this.credit= credit;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public float getCredit() {
			return credit;
		}

		public void setCredit(float credit) {
			this.credit = credit;
		}
		

}
