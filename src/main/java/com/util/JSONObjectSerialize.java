package com.util;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class JSONObjectSerialize implements JsonSerializer<JsonObject>{

	@Override
	public JsonElement serialize(JsonObject src, Type typeOfSrc, JsonSerializationContext context) {
		return null;
	}

}
