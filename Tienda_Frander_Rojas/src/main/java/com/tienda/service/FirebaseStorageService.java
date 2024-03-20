package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "techshop-curso.appspot.com";

    final String rutaSuperiorStorage = "techshop";

    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "techshop-curso-firebase-adminsdk-ik8h4-d999462bf9.json";
}
