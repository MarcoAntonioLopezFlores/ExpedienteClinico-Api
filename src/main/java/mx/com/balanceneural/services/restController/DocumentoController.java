package mx.com.balanceneural.services.restController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import mx.com.balanceneural.services.Service.DocumentoService;
import mx.com.balanceneural.services.entity.Documento;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI")
public class DocumentoController {
	
	@Autowired
	private DocumentoService documentoService;
	
	@PostMapping(value = "/subirDocumento/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public Documento uploadFile(@PathVariable("id") Long idPaciente,@RequestParam MultipartFile file) {
        
        return documentoService.saveFile(file, idPaciente);
    }
	
	@GetMapping("/getAllFiles/{id}")
	public List<Documento> getAll(@PathVariable Long id){
		return documentoService.getAllFiles(id);
	}
	
	@GetMapping("/downloadFile/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable Long fileId){
        
		Documento file = documentoService.getFile(fileId);
		
		
		 System.out.println(file.getFileName());
		
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(file.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "filename=\"" + file.getFileName() + "\"")
                .body(new ByteArrayResource(file.getData()));

    }
	
	

}
