package org.byn.stickynotes.json;

import java.io.IOException;

import org.byn.stickynotes.model.User;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ConvertJson   {
	//User user = new User("ABC","abc@abc.com","abc","12345");
	String json;
	ObjectMapper objectMapper= new ObjectMapper();
	public String convertIntoJson(User user){
		try {
			json=objectMapper.writeValueAsString(user);
			
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}

}
