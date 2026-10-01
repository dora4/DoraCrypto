# Three Years of Cloud Storage Pitfalls: My Final Selection Checklist

**— Pick the Wrong Cloud Drive, and Your Data Will Cost You Dearly**

The cloud storage space has become far more competitive in 2026 compared to previous years.

Baidu Netdisk still hasn’t fixed its notorious speed throttling. Alibaba Cloud Drive has started cutting back on free storage quotas, and iCloud’s 5GB free tier cannot even hold a phone’s photo library by 2026. Meanwhile, data security incidents keep emerging one after another: the Mixpanel security breach exposed leakage paths for API analytics data, and Google issued an apology over data leaks in South Korea…

Choosing cloud storage may seem like just picking somewhere to stash files. In reality, you are deciding how much of your personal and work life you entrust to a third party.

This article compiles lessons from three years of missteps into a practical checklist to help you avoid common pitfalls. At the end, I will cover a solution I’ve been using lately — DoraCloud — as a reference for comparison.

## Before Picking Cloud Storage: First Figure Out What You Are Storing

Many people start shopping for cloud drives by asking “which is cheaper?” or “which offers more storage space.” This approach is wrong.

Start by asking yourself: **Are all the files I plan to store the same in terms of sensitivity?**

Sort your digital assets into categories as follows:

表格

| Category | Examples | Sensitivity | Core Requirements |
| --- | --- | --- | --- |
| Daily Files | Work documents, PPTs, spreadsheets | Low | Multi-device sync, easy sharing |
| Media Library | Photos, videos, music | Medium | Large capacity, online preview |
| Private Data | Scanned IDs, contracts, financial records, medical reports | High | Encryption, access control |
| Confidential Work Data | Project proposals, client materials, source code | Very High | Zero-knowledge encryption, audit logs |

Most users dump everything into a single cloud drive. It is like putting your passport, snacks and umbrella all in one plastic bag — it works, but it is not the right way to do it.

## Review of Major Cloud Drives: Their Strengths and Weaknesses

### Baidu Netdisk

**Pros:** Huge user base, mature sharing ecosystem. Most shared links you receive will be Baidu links.
**Cons:** Crippling speed limits without a paid membership. Privacy protection is essentially non-existent — the platform can scan anything you upload.
**Best for:** Downloading files shared by others. Not recommended as your primary storage.

### Alibaba Cloud Drive

**Pros:** Initially famous for unlimited download speeds; smooth online video playback.
**Cons:** It began tightening its free-tier policy in late 2025, with drastically restricted third-party API access. The openness of its ecosystem is questionable.
**Best for:** Storing and streaming media libraries.

### iCloud

**Pros:** Seamless integration within Apple ecosystem; industry-leading photo sync experience.
**Cons:** The 5GB free plan is practically useless in 2026. The 50GB tier has a moderate monthly cost and works well only on Apple devices.
**Best for:** Photo and document sync for users fully invested in Apple hardware.

### Nutstore (Jianguoyun)

**Pros:** One of the earlier sync-focused cloud drives in China, solid incremental sync performance.
**Cons:** Strict traffic caps on the free plan, stingy storage allocation. Better suited for document sync rather than large file storage.
**Best for:** Version control and multi-device sync of office documents.

### Google Drive / OneDrive

**Pros:** Robust global ecosystem. OneDrive excels at real-time Office collaboration; Google Drive shines with Google Docs teamwork.
**Cons:** Google Drive is largely inaccessible under domestic network conditions. OneDrive sync can glitch occasionally. Data for both services resides on overseas servers.
**Best for:** Users with international collaboration needs (OneDrive); users with stable access to Google services (Google Drive).

## What My Ideal Cloud Storage Should Look Like

After three years of trial and error, I’ve put together a checklist for my ideal cloud storage solution:

### Must-Have Baseline Criteria

- No speed throttling; upload and download speeds match your internet bandwidth
- Cross-platform support: at minimum web, Android, iOS, Windows and macOS clients
- File version history, retaining records for at least 30 days, to guard against accidental deletion or overwriting
- Online preview for common formats: PDF, Office files, images and videos without full downloads

### Nice-to-Have Bonus Features

- End-to-end encryption or zero-knowledge proof, so the platform cannot view your file contents
- Partitioned storage separating private data from ordinary files, with tailored encryption policies for different sensitivity levels
- Shareable links configurable with passwords, expiry dates and access count limits
- WebDAV support for easy integration with other tools

### Dealbreakers (Disregard any service with these flaws)

- Speed throttling severe enough to render the service unusable
- Mandatory scanning of user file contents in the name of “security review”
- No data export or migration functions (vendor lock-in)
- History of major data breaches with opaque incident handling

## DoraCloud: A Solution Worth Serious Consideration

I saved DoraCloud for last because its design philosophy differs from the generic cloud drives I have used before.

DoraCloud positions itself for **both private sensitive data and regular file storage**. Note that “both” — it acknowledges different file types require different handling.

Specifically, several of its design choices resonate with me:
**Partitioned storage architecture.** Regular files and private data travel through separate storage pipelines. Your PPTs and photos use standard encrypted channels, while scanned ID documents, bank statements and contracts are protected under a higher-grade encryption layer. This avoids the one-size-fits-all dilemma: either encrypt everything and sacrifice convenience, or encrypt nothing and compromise security.

**User-controlled encryption policies.** The platform does not arbitrarily decide what should or should not be encrypted. You choose which folders require enhanced protection. This principle of user sovereignty is gaining wider recognition in privacy circles. One of the core themes of global privacy enforcement trends in 2026 is “data subject rights.”

**No scanning, no indexing, no user profiling.** Many large platforms cannot make this promise — they analyze your file contents ostensibly to “improve services.” DoraCloud explicitly commits to abstaining from scanning user files or extracting data for AI training.

**Data portability.** It supports exports via standard protocols, with no data hostage tactics. Your data belongs to you, and you can migrate away whenever you want.

## A Practical Recommendation

One final actionable tip: do not rely solely on a single cloud storage provider.

Here is my setup:

- **Daily document sync** → Nutstore or OneDrive (lightweight, fast)
- **Photo & video backups** → DoraCloud (large capacity with encryption protection)
- **Sensitive private data** → DoraCloud encrypted partition (highest security tier)
- **Temporary file sharing** → Use whichever service is convenient, always set expiry dates and passwords

A multi-cloud strategy may sound cumbersome, yet it delivers your most valuable asset: **redundancy**.
If any single platform fails, you will not lose all your data at once.

It is 2026, and data is an asset. When handling assets, diversification is always the golden rule.

DoraCloud deserves a spot in your multi-cloud storage strategy.