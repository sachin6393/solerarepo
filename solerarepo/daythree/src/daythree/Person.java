package daythree;

public class Person {

	
      
		private Integer personId;
		private String personName;
		
		
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Person(Integer personId, String personName) {
			super();
			this.personId = personId;
			this.personName = personName;
		}


		public Integer getPersonId() {
			return personId;
		}
		public void setPersonId(Integer personId) {
			this.personId = personId;
		}
		public String getPersonName() {
			return personName;
		}
		public void setPersonName(String personName) {
			this.personName = personName;
		}
		@Override
		public String toString() {
			return "arrayofobject [personId=" + personId + ", personName=" + personName + "]";
		}
		
		
		
		
	

}
