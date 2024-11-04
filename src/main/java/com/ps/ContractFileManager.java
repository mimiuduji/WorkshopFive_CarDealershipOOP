package com.ps;

import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
    public void saveContract(Contract contract) {
        try (FileWriter writer = new FileWriter("contracts.txt", true)) {
            // Use instanceof to format based on contract type
            if (contract instanceof SalesContract) {
                // Format and write SalesContract details
            } else if (contract instanceof LeaseContract) {
                // Format and write LeaseContract details
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

