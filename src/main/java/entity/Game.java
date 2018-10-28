package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.annotation.Generated;

@Setter
@Getter
@NoArgsConstructor
@Accessors(chain = true)
@Generated("com.robohorse.robopojogenerator")
public class Game{

	@JsonProperty("reviewScore")
	private int reviewScore;

	@JsonProperty("releaseDate")
	private String releaseDate;

	@JsonProperty("name")
	private String name;

	@JsonProperty("rating")
	private String rating;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private String category;


	@Override
 	public String toString(){
		return 
			"Game{" + 
			"reviewScore = '" + reviewScore + '\'' + 
			",releaseDate = '" + releaseDate + '\'' + 
			",name = '" + name + '\'' + 
			",rating = '" + rating + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}