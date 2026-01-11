package dev.iraelie.e_commerce_backend.service.image;

import dev.iraelie.e_commerce_backend.exceptions.ResourceNotFoundException;
import dev.iraelie.e_commerce_backend.model.Image;
import dev.iraelie.e_commerce_backend.repository.ImageRepository;
import dev.iraelie.e_commerce_backend.service.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ImageService implements IImageService{

    private final ImageRepository imageRepository;
    private IProductService productService;

    @Override
    public Image getImageById(Long id) {
        return imageRepository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Image resource with id: " + id)
                );
    }

    @Override
    public void deleteImageById(Long id) {
        imageRepository.findById(id)
                .ifPresentOrElse(
                        imageRepository::delete,
                        () -> {
                            throw new ResourceNotFoundException("Image resource with id: " + id);
                        }
                        );
    }

    @Override
    public Image saveImage(MultipartFile file, Long productId) {
        return null;
    }

    @Override
    public void updateImage(MultipartFile file, Long imageId) {

    }
}
