package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.arraydeque_crud_operation.ArrayDequeCrudOperation;

public class MainDriver
{
	static ArrayDequeCrudOperation arrayDequeCrudOperation = new ArrayDequeCrudOperation();
	public static void main(String[] args)
	{
		arrayDequeCrudOperation.createTheData();
		
		arrayDequeCrudOperation.readTheData();
		
		arrayDequeCrudOperation.updateTheData();
		
		arrayDequeCrudOperation.deleteTheData();
	}
}