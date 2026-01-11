package dev.iraelie.e_commerce_backend.service.image;

import dev.iraelie.e_commerce_backend.model.Image;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    Image saveImage(MultipartFile file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
