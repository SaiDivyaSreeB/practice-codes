package assignments;
class Student{
	String name;
	int score[];
	String status;
	public Student(String name,int[] score){
	this.name=name;
	this.score=score;
	this.status=status;
	}
	
}
class Validator3{
    
	public String  validateScore(Student s) throws Exception{
		for(int i:s.score) {
			
		if(!(i>=0 && i<=100) ){
			throw new  InvalidScoreException ("Invalid score");
		}
		}
			return " valid score ";
	}
	
	public double  getPercentage(Student s){
	 double percentage;
	  double sum = 0; 
      int i;

      for (i = 0; i < s.score.length; i++) {
          sum += s.score[i];
      }
	  percentage =sum/s.score.length;
	  if(percentage>=33) {
		  s.status="pass";
			 return percentage;
		 }
		 else
		 {
			 s.status="fail";
		 
			 return 0.0;
		 }
	}
}

	class InvalidScoreException extends Exception{
			public InvalidScoreException(String msg){
				super(msg);
			}
		}	
	public class question10 {
		public static void main(String args[]) throws Exception{
			int score[] = {50,40,80,67,69};
			Student s = new Student("Aman",score);
			Validator3 val = new Validator3();
			String ans = val.validateScore(s);
			double per =  val.getPercentage(s);
	       System.out.println("ans ="+ans);
	       System.out.println("per ="+per);

		}
	}
	
