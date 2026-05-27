package com.acorn.day3.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcornServiceEx {

	@Autowired
	AcornDAOEx dao;

	public ArrayList<Acorn> getAcornList() {
		return dao.selectAll();
	}
}
