package dev.iraelie.e_commerce_backend.service.image;

import dev.iraelie.e_commerce_backend.dto.ImageDto;
import dev.iraelie.e_commerce_backend.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
