package prob01;

public class Member {
	private String id;
	private String name;
	private int point;
	
	Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	public String setName(String change_name) {
		name = change_name;
		
		return name;
	}
	
	public int setPoint(int change_point) {
		point = change_point;
		
		return point;
	}
	
	public String setId(String change_id) {
		id = change_id;
		
		return id;
	}
}