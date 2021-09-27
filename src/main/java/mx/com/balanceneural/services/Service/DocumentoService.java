package mx.com.balanceneural.services.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.util.StringUtils;

import mx.com.balanceneural.services.entity.Documento;
import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.repository.DocumentoRepository;
import mx.com.balanceneural.services.utilidades.FileStorageException;

@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;
	
	public Documento saveFile(MultipartFile file,Long idPaciente) {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		try {
			if(fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}
			Documento documento = new Documento();
			documento.setFileName(fileName);
			documento.setFileType(file.getContentType());
			documento.setData(file.getBytes());
			Paciente paciente = new Paciente();
	        paciente.setId(idPaciente);
			documento.setPaciente(paciente);
			return documentoRepository.save(documento);
		}catch (IOException e) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", e);
		}
	}
	
	public Documento getFile(Long idFile) {
		return documentoRepository.findById(idFile).get();
	}
	
	public List<Documento> getAllFiles(Long id){
		Paciente paciente = new Paciente();
        paciente.setId(id);
		return documentoRepository.findAllByPaciente(paciente);
	}
	
	
}
