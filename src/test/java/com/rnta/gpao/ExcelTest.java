package com.rnta.gpao;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
@SpringBootTest
public class ExcelTest {
	private MockMvc MockMvcBuilders;
	private final MockMvc mockMvc = MockMvcBuilders;
	
	@Test    
    public void testUploadSpreadsheet_Empty() throws Exception {

        String fileName = "EmptySpreadsheet.xls";
        String content  = "";

        MockMultipartFile mockMultipartFile = new MockMultipartFile(
                "emptyFile",
                fileName,
                "text/plain",
                content.getBytes());

        System.out.println("emptyFile content is '" + mockMultipartFile.toString() + "'.");

        mockMvc.perform(MockMvcRequestBuilders.multipart("/bluecost/spreadsheet/upload")
                .file("file", mockMultipartFile.getBytes())
                .characterEncoding("UTF-8"))
        .andExpect(status().isOk());

            
}
}