[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/yJC9k_V9)
## Hafta 4 Ödev: E-Ticaret Sipariş ve Envanter Yönetimi

Bir e-ticaret platformunda sipariş ve envanter yönetimi yaparken Java I/O işlemleri ile dosya okuma ve yazma süreçlerini kullanarak hata yönetimi ve exception handling konularını pekiştirmeniz beklenmektedir.

**Tanım**

Bir e-ticaret sistemi oluşturun. Bu sistemde ürün yönetimi, müşteri işlemleri, sipariş oluşturma ve yönetimi yaparken dosya işlemleriyle (okuma, yazma) sistemi zenginleştirin. Ayrıca, hata yönetimi için exception handling yapıları kurun.

**E-Ticaret İşlemleri:**

- Ürün ekleme, güncelleme ve stok yönetimi işlemleri.
- Müşteri bilgilerini yönetme ve sipariş oluşturma.
- Siparişlerin işlenmesi ve hataların yönetimi.

**Java I/O İşlemleri:**

- Dosyaların varlığını kontrol etme, dosya oluşturma ve silme işlemlerini gerçekleştirin.
- BufferedReader kullanarak dosyalardan veri okuyun (örneğin, ürün bilgileri veya müşteri listesi).
- BufferedWriter kullanarak siparişlerin detaylarını ve işlem kayıtlarını bir dosyaya yazın.

**Exception Handling:**

- Try-catch bloklarını kullanarak okuma ve yazma işlemleri sırasında oluşabilecek hataları yönetin.
- Gerektiğinde özel exception sınıfları oluşturun ve kullanın.

**Değerlendirme Kriterleri:**

- Sistemin hatasız çalışması ve exception handling yapısının doğru kurgulanmış olması.
- Dosya işlemlerinin doğru bir şekilde uygulanması ve verilerin dosyalardan okunup yazılabilmesi.
- Kodun okunabilirliği ve yapılan işlemlerin net bir şekilde anlaşılması.

**🚨Sınıflar**

- Customer : Kullanıcı bilgileri ve kullanıcı tarafından yapılan işlemleri gösterir.
- Employee : Çalışan sınıfı çalışana ait bilgileri ve çalışanın yapabileceği methodları içerir.
- Order : Kullanıcıya ait şiparişleri ve bunlara ait methodları içerir.
- Person : Kullanıcı ve çalışana ait ortak nitelik ve davranışlar buradan gelir.
- Product : Ürünlere ait nitelik ve davranışlar bu sınıf içinde tutulur. 
- ProductManagementSystem : Ürün yönetim sisteminin çalışma yapısı burada gösterilir.


