package com.orcsoft.training;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainerDAO {

	static Map<String, Trainer> mockupDB = new HashMap<>();
	static {
		mockupDB.put("1", new Trainer().setId(1).setName("Red").setGender('0').setHuntCount(999).setProtagonist(true));
		mockupDB.put("2", new Trainer().setId(2).setName("Green").setGender('0').setHuntCount(1203).setProtagonist(false));
		mockupDB.put("3", new Trainer().setId(3).setName("Blue").setGender('1').setHuntCount(231).setProtagonist(false));
		mockupDB.put("4", new Trainer().setId(4).setName("Yellow").setGender('1').setHuntCount(50).setProtagonist(false));
		mockupDB.put("5", new Trainer().setId(5).setName("Gold").setGender('0').setHuntCount(120).setProtagonist(true));
		mockupDB.put("6", new Trainer().setId(7).setName("Crystal").setGender('1').setHuntCount(260).setProtagonist(false));
		mockupDB.put("7", new Trainer().setId(8).setName("Silver").setGender('0').setHuntCount(200).setProtagonist(false));
		mockupDB.put("8", new Trainer().setId(9).setName("Satochi").setGender('0').setHuntCount(251).setProtagonist(true));
		mockupDB.put("9", new Trainer().setId(10).setName("Katsumi").setGender('1').setHuntCount(99).setProtagonist(false));
		mockupDB.put("10", new Trainer().setId(11).setName("Tageshi").setGender('0').setHuntCount(80).setProtagonist(false));
	}

	public List<Trainer> findAll() {
		List<Trainer> list = new ArrayList<Trainer>();
		for (Map.Entry<String, Trainer> entry : mockupDB.entrySet()) {
			list.add(entry.getValue());
		}
		return list;
	}

	public Trainer findByID(String id) throws SQLException {
		if (mockupDB.containsKey(id) && id != null) {
			return mockupDB.get(id);
		}
		return null;
	}

}
