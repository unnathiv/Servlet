
public class Hashcode {
    String fname;
    String lname;
 public  Hashcode(String fname,String lname){
	 this.fname=fname;
	 this.lname=lname; 
    } 
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fname == null) ? 0 : fname.hashCode());
	result = prime * result + ((lname == null) ? 0 : lname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Hashcode other = (Hashcode) obj;
	if (fname == null) {
		if (other.fname != null)
			return false;
	} else if (!fname.equals(other.fname))
		return false;
	if (lname == null) {
		if (other.lname != null)
			return false;
	} else if (!lname.equals(other.lname))
		return false;
	return true;
}

	public static void main(String[] args) {
		Hashcode s1=new Hashcode("Unnathi","VallapuReddy");
		Hashcode s2=new Hashcode("Sowji","Gotumukkala");
		Hashcode s3=new Hashcode("Unnathi","VallapuReddy");
//	System.out.println(fname.hashcode());
	System.out.println(s1.equals(s3));
	
	
	}
}
