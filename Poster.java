public class Poster{
	
	int width;
	int length;
	String content;
	String material;


	public Poster(){


	}

	public Poster(int width){
	this.width=width;

	}

	public Poster(int width,int length){
	this.width=width;
	this.length=length;

	}

	public Poster(int width,int length,String content){
	this.width=width;
	this.length=length;
	this.content=content;

	}

	public Poster(int width,int length,String content,String material){
	this.width=width;
	this.length=length;
	this.content=content;
	this.material=material;

	}
	public void posterDetails() {
        System.out.println("Poster Details:");
        System.out.println("Poster Details:" + width);
        System.out.println("Poster Details:" + length);
        System.out.println("Poster Details:" + content);
        System.out.println("Poster Details:" + material);
    }
}