package com.team3.models;

public class Cuenta {
		private int id_costumer;
		private int id_account;
		private float credit;
		private String executive;
		
		public Cuenta(int id_costumer,int id_account,float credit,String executive) {
			super();
			this.id_costumer= id_costumer;
			this.id_account= id_account;
			this.credit= credit;
			this.executive= executive;
			
		}

		public int getId_costumer() {
			return id_costumer;
		}

		public void setId_costumer(int id_costumer) {
			this.id_costumer = id_costumer;
		}

		public int getId_account() {
			return id_account;
		}

		public void setId_account(int id_account) {
			this.id_account = id_account;
		}

		public float getCredit() {
			return credit;
		}

		public void setCredit(float credit) {
			this.credit = credit;
		}

		public String getExecutive() {
			return executive;
		}

		public void setExecutive(String executive) {
			this.executive = executive;
		}
		
}
