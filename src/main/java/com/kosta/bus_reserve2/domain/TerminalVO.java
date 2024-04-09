package com.kosta.bus_reserve2.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TerminalVO {
    private int terminalNo;
    private String terminalName;
    private String region;
}
