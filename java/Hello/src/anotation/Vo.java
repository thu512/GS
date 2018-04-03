package anotation;

public class Vo {
    @StringLengthCheck(val=10)
    private String strVal="sadsadasdsdad";
    
    @StringLengthCheck(val=12)
    private String strVal2="sadsadasdsdad";
		public String getStrVal2() {
			return strVal2;
		}

		public void setStrVal2(String strVal2) {
			this.strVal2 = strVal2;
		}

		public String getStrVal() {
			return strVal;
		}

		public void setStrVal(String strVal) {
			this.strVal = strVal;
		}

	
}