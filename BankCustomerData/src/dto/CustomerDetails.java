package Dto;

public class CustomerDetails
{
        private String firstname;
        private String lastname;
        private String mail;
        private long phoneno;
        private String fathername;
        private int accountno;
        private String branch;
        
        public CustomerDetails()
        {
        	
        }
      
		public CustomerDetails(String firstname, String lastname, String mail, long phoneno, String fathername,
				int accountno, String branch) 
		{
			
			this.firstname = firstname;
			this.lastname = lastname;
			this.mail = mail;
			this.phoneno = phoneno;
			this.fathername = fathername;
			this.accountno = accountno;
			this.branch = branch;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public long getPhoneno() {
			return phoneno;
		}

		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}

		public String getFathername() {
			return fathername;
		}

		public void setFathername(String fathername) {
			this.fathername = fathername;
		}

		public int getAccountno() {
			return accountno;
		}

		public void setAccountno(int accountno) {
			this.accountno = accountno;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		@Override
		public String toString() {
			return "CustomerDetails [firstname=" + firstname + ", lastname=" + lastname + ", mail=" + mail
					+ ", phoneno=" + phoneno + ", fathername=" + fathername + ", accountno=" + accountno + ", branch="
					+ branch + "]";
		}
		
        
}
