# Have you ever thought about this: your files are stored on someone else’s hard drive?

## —A discussion starting from the underlying architecture of cloud storage, and why "data sovereignty" is more than empty rhetoric

Let’s start with a simple test.
Pick up your phone and open any cloud disk app. Take a look at all the files stored there: work documents, family photos, scanned copies of ID cards, your child’s vaccination records, contracts, medical examination reports… It could be hundreds of gigabytes, or even multiple terabytes.

Now ask yourself this question:
**Where are these files physically located?**

You don’t know.

This is not your fault. The cloud storage industry intentionally keeps this information hidden from you.

## What really happens to a file "in the cloud"

Suppose you upload a PDF employment contract to a mainstream cloud drive. The moment you hit the "upload" button, the file goes through this process:

**Upload phase:** The file is split into multiple data chunks, each uploaded separately to different storage nodes. Transmission is secured with TLS encryption at this stage.

**Storage phase:** Once data chunks reach the server, they are written into a distributed file system. One copy of your contract may sit in a data center in Beijing, another in Guiyang, and a third on some third-party CDN node you have never heard of. The provider will never tell you the exact locations.

**Processing phase:** Most cloud drives perform processing on uploaded files — content moderation (to check for violations), format conversion (to enable online preview), deduplication (global hash comparison to save storage space), and thumbnail generation (for images or videos). These operations mean: **the provider’s systems read the content of your files.**

**Metadata phase:** File name, size, type, upload time, sharing history, access frequency — all this information is recorded in a separate metadata database. Even if the file itself is encrypted, metadata can still reveal a great deal.

Your contract is therefore far more than just a PDF. It is a set of fragmented, read, analyzed data copies scattered across different geographic locations. Your control over it is limited to the "delete" button — and even deletion only marks the space as reclaimable. The actual data may remain in backup systems for months or even years.

## Three little-known facts

**Fact 1: Your cloud drive files can be scanned "legally".**
Nearly all mainstream cloud drives include wording in their terms of service along these lines: "To maintain service quality, protect platform security, and comply with laws and regulations, we may review and scan content uploaded by users." By using the service, you agree to this. This is not a data leak; it is written into the contract.

**Fact 2: The cost logic behind "free storage space" on cloud drives.**
The market price for a 1TB hard drive in 2026 is roughly 300 RMB. Yet when a cloud provider gives you 15GB of "free" space, the underlying cost is far more than one-thirtieth of a hard drive. There are also bandwidth costs, operation and maintenance expenses, data center electricity bills, and redundant backups. Where does the money come from? From your data. Your usage patterns, social connections, and consumption preferences carry commercial value far exceeding storage costs.

**Fact 3: End-to-end encrypted cloud drives are extremely rare.**
Most cloud drives that claim to be secure use server-side encryption, not client-side encryption. This means encryption keys are held by the provider. The provider can decrypt your files, law enforcement agencies can compel the provider to decrypt them, and hackers may decrypt them if they breach the key management system. True client-side end-to-end encryption keeps keys solely in your possession, so even the provider cannot open your files. But this approach is uncommon among mainstream cloud services, because it "makes content moderation and value-added services difficult."

## DoraCloud’s alternative approach

DoraCloud was not designed merely to build a better cloud disk. Its core design question is:
**If users truly want full control over their own data, how can this be achieved technically?**

Its answer is a three-tier architecture:
**Tier 1: Local-first.** The original copy of your files always stays on your local device. Cloud storage serves as optional synchronization and backup, not the sole storage location. Your data belongs to you first; the cloud is only a backup.

**Tier 2: Client-side encryption.** Encryption is completed locally before upload, with keys managed by you. The server only stores ciphertext and cannot decrypt or view the content. Even if the server is compromised, attackers will only obtain encrypted data chunks.

**Tier 3: Tiered storage.** Ordinary files (such as movies and music) and sensitive data (such as ID documents and financial statements) adopt different storage policies. Sensitive data can be placed in an encrypted isolated area, physically separated from regular files, requiring additional authentication for access.

## Not everyone needs this

To be honest, most people store movies, TV shows, travel photos and similar content on their cloud drives. For these files, data sovereignty is not an urgent concern. Scanning may happen, but the impact is minimal.

Yet there are always certain files you want no one else to see.

Not because you have done anything wrong. Simply because they are yours. Your contracts, medical records, financial statements, family photos, journals. They exist not to supply data to some platform, but so you can safely retrieve and use them whenever you need.

Cloud storage has developed for more than a decade, and convenience has been perfected. It is time for someone to focus seriously on security and user control.

That is what DoraCloud aims to do.